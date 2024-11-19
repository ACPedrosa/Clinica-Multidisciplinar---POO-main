package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Consulta.StatusConsulta;

/**
 * Representa a agenda de um médico, com horários disponíveis e consultas agendadas.
 */
public class Agenda {
    private ProfissionalMedico medico;                // Médico responsável pela agenda
    private LocalDate dataConsulta;                    // Data da consulta
    private List<LocalTime> horariosDisponiveis;       // Horários disponíveis para consulta
    private List<Consulta> consultasAgendadas;         // Consultas já agendadas para a data

    // Construtor da Agenda
    public Agenda(ProfissionalMedico medico, LocalDate dataConsulta) {
        this.medico = medico;
        this.dataConsulta = dataConsulta;
        this.horariosDisponiveis = new ArrayList<>();
        this.consultasAgendadas = new ArrayList<>();
        // Adicionar horários padrão (por exemplo, 8:00 às 18:00 com intervalos de 30 minutos)
        for (int i = 8; i < 18; i++) {
            for (int j = 0; j < 60; j += 30) {
                this.horariosDisponiveis.add(LocalTime.of(i, j));
            }
        }
    }

    // Verifica se o horário está disponível
    public boolean verificarDisponibilidade(LocalTime horario) {
        // Verifica se o horário já está ocupado
        for (Consulta consulta : consultasAgendadas) {
            if (consulta.getDataHoraConsulta().toLocalTime().equals(horario)) {
                return false; // Se já tiver consulta nesse horário, retorna falso
            }
        }
        return horariosDisponiveis.contains(horario);
    }

    // Método para reservar um horário (associar uma consulta a esse horário)
    public boolean reservarHorario(Paciente paciente, String especialidade, LocalTime horario) {
        if (verificarDisponibilidade(horario)) {
            // Criando a consulta com os dados necessários
            Consulta consulta = new Consulta(
                    0,  // O id poderia ser gerado automaticamente
                    paciente,
                    medico,
                    LocalDateTime.of(dataConsulta, horario),
                    especialidade,
                    StatusConsulta.AGENDADA // Consulta agendada inicialmente
            );
            consultasAgendadas.add(consulta); // Adiciona a consulta à lista de agendadas
            horariosDisponiveis.remove(horario); // Remove o horário da lista de disponíveis
            return true;
        }
        return false; // Caso o horário não esteja disponível
    }

    // Método para visualizar as consultas agendadas
    public List<Consulta> visualizarConsultas() {
        return consultasAgendadas;
    }

    // Getters e Setters
    public ProfissionalMedico getMedico() {
        return medico;
    }

    public void setMedico(ProfissionalMedico medico) {
        this.medico = medico;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public List<LocalTime> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public List<Consulta> getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(List<Consulta> consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }
}

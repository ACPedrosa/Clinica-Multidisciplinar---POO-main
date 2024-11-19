package model;

import java.time.LocalDate;
import java.util.List;

/**
 * Representa o prontuário de um paciente na clínica.
 * Contém informações relacionadas à consulta, diagnóstico, tratamento e prescrições.
 */
public class Prontuario {
    private int idProntuario;
    private Paciente paciente; // Paciente associado a este prontuário
    private ProfissionalMedico medico; // Médico responsável pela consulta
    private LocalDate dataConsulta; // Data da consulta
    private String diagnostico; // Diagnóstico feito pelo médico
    private String tratamento; // Tratamento prescrito pelo médico
    private List<String> prescricoes; // Lista de prescrições médicas

    // Construtor
    public Prontuario(Paciente paciente, ProfissionalMedico medico, LocalDate dataConsulta, 
                      String diagnostico, String tratamento, List<String> prescricoes) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataConsulta = dataConsulta;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.prescricoes = prescricoes;
    }

    // Getters e Setters
    public int getIdProntuario() {
        return idProntuario;
    }

    public void setIdProntuario(int idProntuario) {
        this.idProntuario = idProntuario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public List<String> getPrescricoes() {
        return prescricoes;
    }

    public void setPrescricoes(List<String> prescricoes) {
        this.prescricoes = prescricoes;
    }

    // Método para exibir informações do prontuário
    @Override
    public String toString() {
        return "Prontuario{" +
                "idProntuario=" + idProntuario +
                ", paciente=" + paciente.getNome() +
                ", medico=" + medico.getNome() +
                ", dataConsulta=" + dataConsulta +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamento='" + tratamento + '\'' +
                ", prescricoes=" + prescricoes +
                '}';
    }
}

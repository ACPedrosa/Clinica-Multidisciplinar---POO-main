package model;

import java.time.LocalDateTime;

/**
 * Representa uma consulta médica agendada.
 */
public class Consulta {
    private int idConsulta;
    private Paciente paciente;
    private ProfissionalMedico medico;
    private LocalDateTime dataHoraConsulta;
    private String especialidade;
    private StatusConsulta statusConsulta; // "Agendada", "Cancelada", "Concluída"; dá para aplicar um enum

    // Construtores
    public Consulta() {
    }

    public Consulta(int idConsulta, Paciente paciente, ProfissionalMedico medico, LocalDateTime dataHoraConsulta, String especialidade, StatusConsulta statusConsulta) {
        this.idConsulta = idConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.dataHoraConsulta = dataHoraConsulta;
        this.especialidade = especialidade;
        this.statusConsulta = statusConsulta;
    }

    /**
     * Representa os possíveis status de uma consulta médica.
     */
    public enum StatusConsulta {
        AGENDADA,
        CANCELADA,
        CONCLUIDA;
    }

    // Getters e Setters
    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
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

    public LocalDateTime getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsulta=" + idConsulta +
                ", paciente=" + paciente.getNome() +
                ", medico=" + medico.getNome() +
                ", dataHoraConsulta=" + dataHoraConsulta +
                ", especialidade='" + especialidade + '\'' +
                ", statusConsulta='" + statusConsulta + '\'' +
                '}';
    }
}

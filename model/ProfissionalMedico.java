package model;

import java.time.LocalDate;

/**
 * Classe que representa um médico da clínica, que herda de Funcionario.
 * Possui funcionalidades específicas como o registro no conselho e a data de inscrição.
 */
public class ProfissionalMedico extends Funcionario {
    private int idProfissional;
    private String registroConselho;
    private LocalDate dataInscricao;

    // Construtor padrão
    public ProfissionalMedico() {
        super();
    }

    /**
     * Construtor completo para o Profissional Médico.
     * 
     * @param nome           Nome do médico.
     * @param telefone       Telefone do médico.
     * @param rg             RG do médico.
     * @param cpf            CPF do médico.
     * @param dataNascimento Data de nascimento do médico.
     * @param sexo           Sexo do médico.
     * @param profissao      Profissão do médico.
     * @param registro       Identificador único do médico.
     * @param login          Nome de usuário para o médico.
     * @param senha          Senha de acesso ao médico.
     * @param cargo          Cargo do médico.
     * @param idProfissional Identificador único do médico no conselho.
     * @param registroConselho Número do registro do médico no conselho.
     * @param dataInscricao  Data de inscrição do médico no conselho.
     */
    public ProfissionalMedico(String nome, String telefone, String rg, String cpf, LocalDate dataNascimento, Sexo sexo,
                               String profissao, int registro, String login, String senha, Cargo cargo, 
                               int idProfissional, String registroConselho, LocalDate dataInscricao) {
        super(nome, telefone, rg, cpf, dataNascimento, sexo, profissao, registro, login, senha, cargo);
        this.idProfissional = idProfissional;
        this.registroConselho = registroConselho;
        this.dataInscricao = dataInscricao;
    }

    // Getters e Setters
    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getRegistroConselho() {
        return registroConselho;
    }

    public void setRegistroConselho(String registroConselho) {
        this.registroConselho = registroConselho;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    @Override
    public String toString() {
        return "ProfissionalMedico{" +
                "idProfissional=" + idProfissional +
                ", registroConselho='" + registroConselho + '\'' +
                ", dataInscricao=" + dataInscricao +
                "} " + super.toString();
    }
}

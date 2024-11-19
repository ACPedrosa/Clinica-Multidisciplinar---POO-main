package model;

import java.time.LocalDate;

/**
 * Representa um funcionário da clínica, que herda atributos de Pessoa
 * e adiciona informações específicas como registro, login, senha e cargo.
 */
public class Funcionario extends Pessoa {
    private int registro;
    private String login;
    private String senha;
    private Cargo cargo;  // Alteração para usar enum Cargo

    // Construtor padrão
    public Funcionario() {
        super();
    }

    /**
     * Construtor completo.
     *
     * @param nome           Nome do funcionário.
     * @param telefone       Telefone do funcionário.
     * @param rg             RG do funcionário.
     * @param cpf            CPF do funcionário.
     * @param dataNascimento Data de nascimento do funcionário.
     * @param sexo           Sexo do funcionário.
     * @param profissao      Profissão do funcionário.
     * @param registro       Identificador único do funcionário.
     * @param login          Nome de usuário para acesso ao sistema.
     * @param senha          Senha de acesso ao sistema.
     * @param cargo          Cargo do funcionário.
     */
    public Funcionario(String nome, String telefone, String rg, String cpf, LocalDate dataNascimento, Sexo sexo, 
                       String profissao, int registro, String login, String senha, Cargo cargo) {
        super(nome, telefone, rg, cpf, dataNascimento, sexo, profissao);
        this.registro = registro;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public enum Cargo {
        RECEPCIONISTA,
        MEDICO,
        GERENTE;
    }

    // Getters e Setters
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * Representação textual do funcionário.
     */
    @Override
    public String toString() {
        return "Funcionario{" +
                "registro=" + registro +
                ", login='" + login + '\'' +
                ", cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}

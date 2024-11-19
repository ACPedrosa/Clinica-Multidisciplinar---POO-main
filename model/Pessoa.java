package model;

import java.time.LocalDate;

/**
 * Representa uma pessoa com informações pessoais.
 * Inclui dados como nome, CPF, RG, telefone, sexo, entre outros.
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String rg;
    private String cpf;
    private LocalDate dataNascimento; // Alterado para LocalDate
    private Sexo sexo; // Enum para sexo
    private String profissao;

    /**
     * Construtor padrão.
     */
    public Pessoa() {
    }

    /**
     * Construtor completo.
     * 
     * @param nome           Nome da pessoa.
     * @param telefone       Telefone da pessoa.
     * @param rg             RG da pessoa.
     * @param cpf            CPF da pessoa.
     * @param dataNascimento Data de nascimento da pessoa.
     * @param sexo           Sexo da pessoa.
     * @param profissao      Profissão da pessoa.
     */
    public Pessoa(String nome, String telefone, String rg, String cpf, LocalDate dataNascimento, Sexo sexo,
            String profissao) {
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.profissao = profissao;
    }

    /**
     * Obtém o nome da pessoa.
     * 
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome Nome da pessoa.
     */
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    /**
     * Obtém o telefone da pessoa.
     * 
     * @return Telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone da pessoa.
     * 
     * @param telefone Telefone da pessoa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o RG da pessoa.
     * 
     * @return RG da pessoa.
     */
    public String getRg() {
        return rg;
    }

    /**
     * Define o RG da pessoa.
     * 
     * @param rg RG da pessoa.
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * Obtém o CPF da pessoa.
     * 
     * @return CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa.
     * 
     * @param cpf CPF da pessoa.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém a data de nascimento da pessoa.
     * 
     * @return Data de nascimento da pessoa.
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define a data de nascimento da pessoa.
     * 
     * @param dataNascimento Data de nascimento da pessoa.
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Obtém o sexo da pessoa.
     * 
     * @return Sexo da pessoa.
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Define o sexo da pessoa.
     * 
     * @param sexo Sexo da pessoa.
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtém a profissão da pessoa.
     * 
     * @return Profissão da pessoa.
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Define a profissão da pessoa.
     * 
     * @param profissao Profissão da pessoa.
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * Enum para sexo.
     */
    public enum Sexo {
        MASCULINO, FEMININO, OUTRO;

        /**
         * Converte uma string em um valor do enum Sexo.
         * 
         * @param sexoString String representando o sexo.
         * @return Valor correspondente no enum Sexo.
         * @throws IllegalArgumentException Se o valor da string não for válido.
         */
        public static Sexo fromString(String sexoString) {
            if (sexoString == null) {
                return null;
            }
            switch (sexoString.toUpperCase()) {
                case "MASCULINO":
                    return MASCULINO;
                case "FEMININO":
                    return FEMININO;
                case "OUTRO":
                    return OUTRO;
                default:
                    throw new IllegalArgumentException("Sexo inválido: " + sexoString);
            }
        }
    }

    /**
     * Representação textual da pessoa.
     * 
     * @return String representando os dados da pessoa.
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}

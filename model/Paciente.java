package model;

import java.time.LocalDate;

/**
 * Representa um paciente com informações pessoais e de saúde.
 * Herda da classe Pessoa e inclui atributos específicos, como tipo sanguíneo, peso, altura, hábitos de saúde e condições médicas.
 */
public class Paciente extends Pessoa {
    private int pacienteId;
    private Etnia etnia;
    private TipoSanguineo tipoSanguineo;
    private boolean fatorRh; // True para positivo, false para negativo
    private double peso; // Em quilogramas
    private double altura; // Em metros
    private boolean doador; // True se for doador de órgãos
    private boolean fumante; // True se for fumante
    private String doencas; // Doenças pré-existentes
    private String limitacoes; // Limitações físicas ou médicas

    /**
     * Construtor padrão.
     */
    public Paciente() {
        super(); // Chama o construtor padrão da classe Pessoa
    }

    /**
     * Construtor completo.
     *
     * @param idPaciente     Identificador único do paciente.
     * @param nome           Nome do paciente.
     * @param telefone       Telefone de contato.
     * @param rg             Documento de identidade (RG).
     * @param cpf            Cadastro de Pessoa Física (CPF).
     * @param dataNascimento Data de nascimento do paciente.
     * @param sexo           Sexo do paciente.
     * @param profissao      Profissão do paciente.
     * @param etnia          Etnia do paciente.
     * @param tipoSanguineo  Tipo sanguíneo do paciente.
     * @param fatorRh        Fator Rh do paciente (positivo ou negativo).
     * @param peso           Peso em quilogramas.
     * @param altura         Altura em metros.
     * @param doador         Indica se o paciente é doador de órgãos.
     * @param fumante        Indica se o paciente é fumante.
     * @param doencas        Lista de doenças pré-existentes.
     * @param limitacoes     Lista de limitações físicas ou médicas.
     */
    public Paciente(int pacienteId, String nome, String telefone, String rg, String cpf, LocalDate dataNascimento, Sexo sexo,
                    String profissao, Etnia etnia, TipoSanguineo tipoSanguineo, boolean fatorRh, double peso,
                    double altura, boolean doador, boolean fumante, String doencas, String limitacoes) {
        super(nome, telefone, rg, cpf, dataNascimento, sexo, profissao); // Chama o construtor da classe Pessoa
        this.pacienteId = pacienteId;
        this.etnia = etnia;
        this.tipoSanguineo = tipoSanguineo;
        this.fatorRh = fatorRh;
        this.peso = peso;
        this.altura = altura;
        this.doador = doador;
        this.fumante = fumante;
        this.doencas = doencas;
        this.limitacoes = limitacoes;
    }

    /**
     * Enums para Tipo Sanguíneo e Etnia.
     */
    public enum TipoSanguineo {
        A_POSITIVO, A_NEGATIVO, B_POSITIVO, B_NEGATIVO, AB_POSITIVO, AB_NEGATIVO, O_POSITIVO, O_NEGATIVO
    }

    public enum Etnia {
        BRANCA, NEGRA, PARDA, INDIGENA, AMARELA, OUTRA
    }

    // Métodos Getters e Setters

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int idPaciente) {
        this.pacienteId = idPaciente;
    }

    public Etnia getEtnia() {
        return etnia;
    }

    public void setEtnia(Etnia etnia) {
        this.etnia = etnia;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public boolean isFatorRh() {
        return fatorRh;
    }

    public void setFatorRh(boolean fatorRh) {
        this.fatorRh = fatorRh;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public boolean isDoador() {
        return doador;
    }

    public void setDoador(boolean doador) {
        this.doador = doador;
    }

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public String getDoencas() {
        return doencas;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }

    public String getLimitacoes() {
        return limitacoes;
    }

    public void setLimitacoes(String limitacoes) {
        this.limitacoes = limitacoes;
    }

    /**
     * Calcula o Índice de Massa Corporal (IMC).
     *
     * @return O IMC do paciente.
     * @throws IllegalArgumentException Se a altura for inválida.
     */
    public double calcularIMC() {
        if (altura > 0) {
            return peso / (altura * altura);
        }
        throw new IllegalArgumentException("Altura deve ser maior que zero para calcular o IMC.");
    }

    /**
     * Representação textual do paciente.
     */
    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + pacienteId +
                ", etnia=" + etnia +
                ", tipoSanguineo=" + tipoSanguineo +
                ", fatorRh=" + (fatorRh ? "Positivo" : "Negativo") +
                ", peso=" + peso +
                ", altura=" + altura +
                ", doador=" + doador +
                ", fumante=" + fumante +
                ", doencas='" + doencas + '\'' +
                ", limitacoes='" + limitacoes + '\'' +
                ", dadosPessoa=" + super.toString() +
                '}';
    }
}

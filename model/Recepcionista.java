package model;

import java.time.LocalDate;

/**
 * Classe que representa um Recepcionista com suas propriedades
 * (dados do recepcionista).
 */
public class Recepcionista extends Funcionario {
    // Atributos específicos do recepcionista
    private String setor;

    // Construtor padrão
    public Recepcionista() {
        super();
    }

    // Construtor com todos os parâmetros
    public Recepcionista(String nome, String telefone, String rg, String cpf, LocalDate dataNascimento, Sexo sexo,
                         String profissao, int registro, String login, String senha, Cargo cargo, String setor) {
        super(nome, telefone, rg, cpf, dataNascimento, sexo, profissao, registro, login, senha, cargo);
        this.setor = setor;
    }

    // Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Recepcionista{" +
                "setor='" + setor + '\'' +
                "} " + super.toString();
    }
}

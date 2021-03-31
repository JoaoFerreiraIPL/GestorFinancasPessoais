package FinancasPessoais;

import java.util.Objects;

public class Categoria {
    private String nome;
    private String descricao;

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    //SETTERS
    public void setNome(String nome) {

        this.nome = nome;


    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }



    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

package FinancasPessoais;

import javax.xml.crypto.Data;
import java.util.Objects;

public class Objectivo {
    protected String descricao;
    protected Data dataLimite;
    protected float valor;

    public Objectivo(String descricao, Data dataLimite, float valor) {
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Data getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Data dataLimite) {
        this.dataLimite = dataLimite;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Objectivo{" +
                "descricao='" + descricao + '\'' +
                ", dataLimite=" + dataLimite +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objectivo objectivo = (Objectivo) o;
        return Objects.equals(descricao, objectivo.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }
}

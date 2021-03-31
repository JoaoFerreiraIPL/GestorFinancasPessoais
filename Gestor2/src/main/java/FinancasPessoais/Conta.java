package FinancasPessoais;

import java.util.Objects;

public class Conta {


    private String nomeConta;
    private String nomeBanco;
    private Long saldoInicial;

    public Conta(String nomeConta, String nomeBanco, Long saldoInicial) {
        this.nomeConta = nomeConta;
        this.nomeBanco = nomeBanco;
        this.saldoInicial = saldoInicial;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Long getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Long saldoInicial) {
        this.saldoInicial = saldoInicial;
    }



    @Override
    public String toString() {
        return "Conta{" +
                "nomeConta='" + nomeConta + '\'' +
                ", nomeBanco='" + nomeBanco + '\'' +
                ", saldoInicial=" + saldoInicial +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(nomeConta, conta.nomeConta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeConta);
    }
}

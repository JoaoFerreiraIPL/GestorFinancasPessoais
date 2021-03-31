package FinancasPessoais;

import java.util.ArrayList;

public class GestorFinancas {

    private ArrayList<Conta> contas;
    private ArrayList<Objectivo> objectivos;
    private ArrayList<Categoria> categorias;

    private GestorFinancas() {
        contas = new ArrayList<>();
        objectivos = new ArrayList<>();
        categorias = new ArrayList<>();
    }


}

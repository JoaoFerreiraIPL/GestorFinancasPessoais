package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JPanel JpanelPrincipal;
    private JPanel CardPanel;
    private JButton vistaGeralButton;
    private JButton adicionarReceitaButton;
    private JButton adicionarDespesaButton;
    private JButton definirObjetivosButton;
    private JButton plafondsButton;
    private JButton consultasButton;
    private JButton configuraçõesButton;
    private JButton categoriasButton;
    private JButton contasBancariasButton;
    private JPanel VistaGeralPanel;
    private JPanel AdicionarReceitaPanel;
    private JPanel AdicionarDespesaPanel;
    private JPanel DefinirObjetivosPanel;
    private JPanel PlanfondsPanel;
    private JPanel ConsultasPanel;
    private JPanel ConfiguracoesPanel;
    private JPanel CategoriasPanel;
    private JPanel ContasPanel;

    private JScrollBar scrollBarCat;
    private JList listCat;
    private JTextField textFieldNomeCat;
    private JTextField textFieldDescCat;
    private JButton buttonInsertCat;
    private JScrollBar scrollBar1;
    private JList list1;
    private JScrollBar scrollContas;
    private JList listContas;
    private JTextField scrollBanco;
    private JComboBox comboBoxTipoConta;
    private JFormattedTextField formattedTextSaldoInicial;
    private JButton buttonInserirConta;
    private JTextField scrollNome;


    public MenuPrincipal() {
        super("Gestor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(JpanelPrincipal);
        pack();

        categoriasButton.setVisible(false);
        contasBancariasButton.setVisible(false);




        vistaGeralButton.addActionListener(this::btnVistaGeralActionPerformed);
        categoriasButton.addActionListener(this::btnCategoriasActionPerformed);
        configuraçõesButton.addActionListener(this::btnConfiguracoesActionPerformed);
    }

    private void btnConfiguracoesActionPerformed(ActionEvent actionEvent) {
        categoriasButton.setVisible(!categoriasButton.isVisible());
        contasBancariasButton.setVisible(!contasBancariasButton.isVisible());
    }

    private void btnCategoriasActionPerformed(ActionEvent actionEvent) {
        categoriasButton.setVisible(!categoriasButton.isVisible());
        contasBancariasButton.setVisible(!contasBancariasButton.isVisible());


    }

    private void btnVistaGeralActionPerformed(ActionEvent actionEvent) {
        CardPanel.removeAll();
        CardPanel.add(VistaGeralPanel);
        CardPanel.repaint();
        CardPanel.revalidate();
    }


    private void testarGIt(){
        return;
    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}

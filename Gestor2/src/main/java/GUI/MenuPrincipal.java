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

    private JComboBox comboBoxTipoConta;
    private JButton buttonInserirConta;
    private JList listContas;
    private JFormattedTextField formattedTextSaldoInicial;
    private JTextField scrollBanco;
    private JTextField scrollNome;
    private JScrollBar scrollContas;


 

    public MenuPrincipal() {
        super("Gestor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(JpanelPrincipal);
        pack();

        categoriasButton.setVisible(false);
        contasBancariasButton.setVisible(false);




        vistaGeralButton.addActionListener(this::btnVistaGeralActionPerformed);
        consultasButton.addActionListener(this::btnConsulta);
    }

    private void btnConsulta(ActionEvent actionEvent) {
        


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

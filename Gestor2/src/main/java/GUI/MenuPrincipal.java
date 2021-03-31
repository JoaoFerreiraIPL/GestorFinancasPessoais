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

    public MenuPrincipal() {
        super("Gestor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(JpanelPrincipal);
        pack();
        vistaGeralButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardPanel.removeAll();
                CardPanel.add(VistaGeralPanel);
                CardPanel.repaint();
                CardPanel.revalidate();
            }
        });
        adicionarReceitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardPanel.removeAll();
                CardPanel.add(AdicionarReceitaPanel);
                CardPanel.repaint();
                CardPanel.revalidate();
            }
        });
    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}
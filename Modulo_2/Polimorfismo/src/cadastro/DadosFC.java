package cadastro;

import javax.swing.*;
import java.awt.*;

public class DadosFC extends JFrame {

    JFrame campoFinalFisica;
    private JPanel pnlFimFisica;
    private JTextField txtDadosName, txtDadosCpf;
    private JTextField txtDadosEmail, txtDadosTelefone;
    private JTextField chequeEspecial;
    private JLabel lblEspecial, lblCliente;

    public void dadosFimFisica() {
        campoFinalFisica = new JFrame("Fim");
        campoFinalFisica.setVisible(false);
        campoFinalFisica.setSize(540, 484);
        campoFinalFisica.setLocationRelativeTo(null);
        campoFinalFisica.setResizable(false);
        campoFinalFisica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlFimFisica = new JPanel();
        pnlFimFisica.setPreferredSize(new Dimension(500, 400));
        pnlFimFisica.setSize(500, 400);
        pnlFimFisica.setLayout(null);
        pack();
        pnlFimFisica.setBackground(new Color(0x767E8896, true));

        lblCliente = new JLabel("Cliente");
        lblCliente.setBounds(150, 38, 100, 30);
        lblCliente.setFont(new Font("Arial Black", Font.BOLD, 12));

        txtDadosName = new JTextField();
        txtDadosName.setBounds(147, 60, 200, 30);

        txtDadosCpf = new JTextField();
        txtDadosCpf.setBounds(147, 100, 200, 30);

        txtDadosEmail = new JTextField();
        txtDadosEmail.setBounds(147, 140, 200, 30);

        txtDadosTelefone = new JTextField();
        txtDadosTelefone.setBounds(147, 180, 200, 30);

        lblEspecial = new JLabel("Cheque Especial");
        lblEspecial.setBounds(150, 215, 150, 40);
        lblEspecial.setFont(new Font("Arial Black", Font.BOLD, 12));

        chequeEspecial = new JTextField();
        chequeEspecial.setBounds(147, 250, 200, 30);

        pnlFimFisica.add(lblCliente);
        pnlFimFisica.add(txtDadosName);
        pnlFimFisica.add(txtDadosCpf);
        pnlFimFisica.add(txtDadosEmail);
        pnlFimFisica.add(txtDadosTelefone);
        pnlFimFisica.add(lblEspecial);
        pnlFimFisica.add(chequeEspecial);

        campoFinalFisica.add(pnlFimFisica);
    }
}

package cadastro;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class FormJuridico extends JFrame {
    private JPanel pnlJuridico;

    private JLabel lblNameFantasia;
    private JTextField txtFantasia;
    private JLabel lblSocial;
    private JTextField txtSocial;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblCnpj;
    private JFormattedTextField txtCnpj;

    private JButton btnFinalizarJuridico;

    public FormJuridico() throws ParseException {
        getPnlJuridico();
    }

    public JPanel getPnlJuridico() throws ParseException {
        pnlJuridico = new JPanel();
        pnlJuridico.setPreferredSize(new Dimension(500,400));
        pnlJuridico.setSize(500,400);
        pnlJuridico.setLayout(null);
        pack();
        pnlJuridico.setBackground(new Color(0x767E8896, true));

        lblNameFantasia = new JLabel("Nome Fantasia:");
        lblNameFantasia.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblNameFantasia.setBounds(60, 60, 100, 20);
        txtFantasia = new JTextField();
        txtFantasia.setBounds(180, 60, 250, 25);

        lblSocial = new JLabel("Razão Social:");
        lblSocial.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblSocial.setBounds(60, 100, 100, 20);
        txtSocial = new JTextField();
        txtSocial.setBounds(180, 100, 250, 25);

        lblCnpj = new JLabel("Cnpj:");
        lblCnpj.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblCnpj.setBounds(90, 140, 100, 20);
        txtCnpj = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        txtCnpj.setBounds(180, 140, 250, 25);

        lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblEmail.setBounds(90, 180, 100, 20);
        txtEmail = new JTextField();
        txtEmail.setBounds(180, 180, 250, 25);

        btnFinalizarJuridico = new JButton("Próximo");
        btnFinalizarJuridico.setFont(new Font("Arial Black", Font.BOLD, 15));
        btnFinalizarJuridico.setBounds(187, 320, 150, 28);
        btnFinalizarJuridico.setBackground(new Color(0x1010A2));
        btnFinalizarJuridico.setForeground(new Color(0xFFFFFF));

        pnlJuridico.add(lblNameFantasia);
        pnlJuridico.add(txtFantasia);

        pnlJuridico.add(lblSocial);
        pnlJuridico.add(txtSocial);

        pnlJuridico.add(lblCnpj);
        pnlJuridico.add(txtCnpj);

        pnlJuridico.add(lblEmail);
        pnlJuridico.add(txtEmail);

        pnlJuridico.add(btnFinalizarJuridico);

        return pnlJuridico;
    }

    public static void main(String[] args) throws ParseException {
        FormJuridico t = new FormJuridico();
        t.getContentPane().add(t.pnlJuridico);
        t.setVisible(true);
        t.setSize(500, 400);
        t.setResizable(false);
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

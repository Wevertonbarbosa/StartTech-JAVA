package cadastro;

import cadastro.FormJuridico;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Cadastro extends JFrame implements ActionListener {
    private JPanel pnlMain;
    private JButton btnJuridica;
    private JButton btnFisica;

    private JPanel pnlFormFisica;
    private JTextField txtNome;
    private JLabel lblNome;

    private JTextField txtEmail;
    private JLabel lblEmail;

    private JFormattedTextField txtCpf;
    private JLabel lblCpf;

    private JFormattedTextField txtTelefone;
    private JLabel lblTelefone;

    private JButton btnFinalizarFisica;

    FormJuridico pnlJuridico = new FormJuridico();


    public JPanel getPnlMain() throws ParseException {
        pnlMain.setBackground(new Color(0x767E8896, true));

        btnFisica.setForeground(new Color(0xFFFFFF));
        btnFisica.setBackground(new Color(0x1010A2));

        btnJuridica.setBackground(new Color(0x1010A2));
        btnJuridica.setForeground(new Color(0xFFFFFF));

        btnFisica.addActionListener(this::actionPerformed);

        getPnlForm();
        pnlJuridico.getPnlJuridico();

        return pnlMain;
    }

    public JPanel getPnlForm() throws ParseException {
        pnlFormFisica = new JPanel();
        pnlFormFisica.setPreferredSize(new Dimension(500, 400));
        pnlFormFisica.setLayout(null);
        pack();
        pnlFormFisica.setBackground(new Color(0x767E8896, true));


        lblNome = new JLabel("Nome:", JLabel.CENTER);
        lblNome.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblNome.setBounds(60, 60, 100, 20);
        txtNome = new JTextField(20);
        txtNome.setBounds(150, 60, 250, 25);

        lblCpf = new JLabel("CPF:", JLabel.CENTER);
        lblCpf.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblCpf.setBounds(60, 100, 100, 20);
        txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        txtCpf.setBounds(150, 100, 250, 25);

        lblEmail = new JLabel("Email:", JLabel.CENTER);
        lblEmail.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblEmail.setBounds(60, 140, 100, 20);
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 140, 250, 25);

        lblTelefone = new JLabel("Telefone:", JLabel.CENTER);
        lblTelefone.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblTelefone.setBounds(60, 180, 100, 20);
        txtTelefone = new JFormattedTextField(new MaskFormatter("## (##) #####-####"));
        txtTelefone.setBounds(150, 180, 250, 25);


        btnFinalizarFisica = new JButton("Próximo");
        btnFinalizarFisica.setFont(new Font("Arial Black", Font.BOLD, 15));
        btnFinalizarFisica.setBounds(187, 320, 150, 28);
        btnFinalizarFisica.setBackground(new Color(0x1010A2));
        btnFinalizarFisica.setForeground(new Color(0xFFFFFF));

        pnlFormFisica.add(lblNome);
        pnlFormFisica.add(txtNome);

        pnlFormFisica.add(lblCpf);
        pnlFormFisica.add(txtCpf);

        pnlFormFisica.add(lblTelefone);
        pnlFormFisica.add(txtTelefone);

        pnlFormFisica.add(lblEmail);
        pnlFormFisica.add(txtEmail);

        pnlFormFisica.add(btnFinalizarFisica);

        return pnlFormFisica;
    }

    public Cadastro() throws ParseException {
        getPnlMain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            getPnlMain().setVisible(false);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
        try {
            getContentPane().add(pnlJuridico.getPnlJuridico());
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }

        try {
            pnlJuridico.getPnlJuridico().setVisible(true);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }


    public static void main(String[] args) throws ParseException {
        Cadastro cadastro = new Cadastro();
        cadastro.getContentPane().add(cadastro.pnlMain);
        cadastro.setTitle("Sistema de Cadastro");
        cadastro.setVisible(true);
        cadastro.setSize(500, 400);
        cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastro.setLocationRelativeTo(null);
    }

}


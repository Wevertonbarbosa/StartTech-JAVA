package cadastro;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Cadastro extends JFrame implements ActionListener {
    private JPanel pnlMain;
    private JButton btnJuridica, btnFisica;

    public boolean escolheuFisica = false;
    public boolean escolheuJuridica = false;
    public boolean escolheuCorrente = false;
    public boolean escolheuPoupanca = false;

    Deposito deposito = new Deposito();
    public Cadastro() throws ParseException {
        getPnlMain();
    }

    public JPanel getPnlMain() throws ParseException {
        pnlMain.setBackground(new Color(0x767E8896, true));

        btnFisica.setForeground(new Color(0xFFFFFF));
        btnFisica.setBackground(new Color(0x1010A2));

        btnJuridica.setBackground(new Color(0x1010A2));
        btnJuridica.setForeground(new Color(0xFFFFFF));

        btnFisica.addActionListener(this::actionPerformed);
        btnJuridica.addActionListener(this::campoJuridico);

        deposito.campoDeposito();
        getPnlFormFisica();
        getPnlJuridico();


        return pnlMain;
    }

    private JPanel pnlFormFisica;
    private JTextField txtNome, txtEmail;
    private JLabel lblNome, lblEmail;
    private JFormattedTextField txtCpf, txtTelefone;
    private JLabel lblCpf, lblTelefone;
    private JButton btnCorrente, btnPoupanca;

    public JPanel getPnlFormFisica() throws ParseException {
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

        btnCorrente = new JButton("Conta Corrente");
        btnPoupanca = new JButton("Conta Poupança");

        btnCorrente.setBackground(new Color(0x1010A2));
        btnPoupanca.setBackground(new Color(0x1010A2));

        btnCorrente.setForeground(new Color(0xFFFFFF));
        btnPoupanca.setForeground(new Color(0xFFFFFF));

        btnCorrente.setFont(new Font("Arial Black", Font.TYPE1_FONT, 15));
        btnPoupanca.setFont(new Font("Arial Black", Font.TYPE1_FONT, 15));

        btnCorrente.setBounds(30, 290, 200, 45);
        btnPoupanca.setBounds(270, 290, 200, 45);

        btnCorrente.addActionListener(this::cenarioDepositoCorrente);
        btnPoupanca.addActionListener(this::cenarioDepositoPoupanca);

        pnlFormFisica.add(lblNome);
        pnlFormFisica.add(txtNome);

        pnlFormFisica.add(lblCpf);
        pnlFormFisica.add(txtCpf);

        pnlFormFisica.add(lblTelefone);
        pnlFormFisica.add(txtTelefone);

        pnlFormFisica.add(lblEmail);
        pnlFormFisica.add(txtEmail);

        pnlFormFisica.add(btnCorrente);
        pnlFormFisica.add(btnPoupanca);

        return pnlFormFisica;
    }

    private JPanel pnlJuridico;
    private JLabel lblNameFantasia, lblSocial;
    private JTextField txtFantasia, txtSocial;
    private JLabel lblEmailJuridico, lblCnpj;
    private JTextField txtEmailJuridico, txtCnpj;

    public JPanel getPnlJuridico() throws ParseException {
        pnlJuridico = new JPanel();
        pnlJuridico.setPreferredSize(new Dimension(500, 400));
        pnlJuridico.setSize(500, 400);
        pnlJuridico.setLayout(null);
        pack();
        pnlJuridico.setBackground(new Color(0x767E8896, true));

        lblNameFantasia = new JLabel("Nome Fantasia:");
        lblNameFantasia.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblNameFantasia.setBounds(68, 60, 150, 20);
        txtFantasia = new JTextField();
        txtFantasia.setBounds(180, 60, 250, 25);

        lblSocial = new JLabel("Razão Social:");
        lblSocial.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblSocial.setBounds(80, 100, 100, 20);
        txtSocial = new JTextField();
        txtSocial.setBounds(180, 100, 250, 25);

        lblCnpj = new JLabel("Cnpj:");
        lblCnpj.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblCnpj.setBounds(90, 140, 100, 20);
        txtCnpj = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
        txtCnpj.setBounds(180, 140, 250, 25);

        lblEmailJuridico = new JLabel("Email:");
        lblEmailJuridico.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblEmailJuridico.setBounds(90, 180, 100, 20);
        txtEmailJuridico = new JTextField();
        txtEmailJuridico.setBounds(180, 180, 250, 25);

        btnCorrente = new JButton("Conta Corrente");
        btnPoupanca = new JButton("Conta Poupança");

        btnCorrente.setBackground(new Color(0x1010A2));
        btnPoupanca.setBackground(new Color(0x1010A2));

        btnCorrente.setForeground(new Color(0xFFFFFF));
        btnPoupanca.setForeground(new Color(0xFFFFFF));

        btnCorrente.setFont(new Font("Arial Black", Font.TYPE1_FONT, 15));
        btnPoupanca.setFont(new Font("Arial Black", Font.TYPE1_FONT, 15));

        btnCorrente.setBounds(30, 290, 200, 45);
        btnPoupanca.setBounds(270, 290, 200, 45);

        btnCorrente.addActionListener(this::cenarioDepositoCorrente);
        btnPoupanca.addActionListener(this::cenarioDepositoPoupanca);

        pnlJuridico.add(lblNameFantasia);
        pnlJuridico.add(txtFantasia);

        pnlJuridico.add(lblSocial);
        pnlJuridico.add(txtSocial);

        pnlJuridico.add(lblCnpj);
        pnlJuridico.add(txtCnpj);

        pnlJuridico.add(lblEmailJuridico);
        pnlJuridico.add(txtEmailJuridico);

        pnlJuridico.add(btnCorrente);
        pnlJuridico.add(btnPoupanca);

        return pnlJuridico;
    }




    //Cenário Para o Fim de forma Física!

//    JFrame campoFinalJuridico;
//
//    private JPanel pnlFimJuridico;
//
//    private JTextField txtDadosNameJuridico,txtDadosEmailJuridico;
//    private JTextField txtDadosCpfJuridico,txtDadosTelefoneJuridico;
//    private JLabel lblRendimento,lblClienteJuridico;
//
//    private JTextField rendimento;


//    public void dadosFimJuridico(){
//        campoFinalJuridico = new JFrame("Fim");
//        campoFinalJuridico.setVisible(false);
//        campoFinalJuridico.setSize(540, 484);
//        campoFinalJuridico.setLocationRelativeTo(null);
//        campoFinalJuridico.setResizable(false);
//        campoFinalJuridico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        pnlFimJuridico = new JPanel();
//        pnlFimJuridico.setPreferredSize(new Dimension(500, 400));
//        pnlFimJuridico.setSize(500, 400);
//        pnlFimJuridico.setLayout(null);
//        pack();
//        pnlFimJuridico.setBackground(new Color(0x767E8896, true));
//
//        lblClienteJuridico = new JLabel("Cliente");
//        lblClienteJuridico.setBounds(150, 38, 100, 30);
//        lblClienteJuridico.setFont(new Font("Arial Black", Font.BOLD, 12));
//
//        txtDadosNameJuridico = new JTextField(txtNome.getText());
//        txtDadosNameJuridico.setBounds(147, 60, 200, 30);
//
//        txtDadosCpfJuridico = new JTextField(txtCpf.getText());
//        txtDadosCpfJuridico.setBounds(147, 100, 200, 30);
//
//        txtDadosEmailJuridico = new JTextField(txtEmail.getText());
//        txtDadosEmailJuridico.setBounds(147, 100, 200, 30);
//
//        txtDadosTelefoneJuridico = new JTextField(txtTelefone.getText());
//        txtDadosTelefoneJuridico.setBounds(147, 180, 200, 30);
//
//        lblRendimento = new JLabel("Rendimento:");
//        lblRendimento.setBounds(150, 215, 150, 40);
//        lblRendimento.setFont(new Font("Arial Black", Font.BOLD, 12));
//
//        rendimento = new JTextField();
//        rendimento.setBounds(147, 250, 200, 30);
//
//
//        pnlFimJuridico.add(lblClienteJuridico);
//        pnlFimJuridico.add(txtDadosNameJuridico);
//        pnlFimJuridico.add(txtDadosCpfJuridico);
//        pnlFimJuridico.add(txtEmailJuridico);
//        pnlFimJuridico.add(txtDadosTelefoneJuridico);
//        pnlFimJuridico.add(lblRendimento);
//        pnlFimJuridico.add(rendimento);
//
//        campoFinalJuridico.add(pnlFimJuridico);
//
//    }


    //Botão para ir ao Formulário Fisica
    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            getPnlMain().setVisible(false);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }

        getContentPane().add(pnlFormFisica);

        escolheuFisica = true;

        try {
            getPnlFormFisica().setVisible(true);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    //Botão para ir para o formulário Juridico
    private void campoJuridico(ActionEvent actionEvent) {
        try {
            getPnlMain().setVisible(false);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        getContentPane().add(pnlJuridico);

        escolheuJuridica = true;

        try {
            getPnlJuridico().setVisible(true);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Cenário do botõe conta corrente
    private void cenarioDepositoCorrente(ActionEvent actionEvent) {

        escolheuCorrente = true;

        try {
            deposito.campoDeposito();
            deposito.janelaDeposito.setVisible(true);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    //    Cenário do botão poupanca
    private void cenarioDepositoPoupanca(ActionEvent actionEvent) {
        escolheuPoupanca = true;

        try {
            deposito.campoDeposito();
            deposito.janelaDeposito.setVisible(true);
        } catch (ParseException e) {
            throw new RuntimeException(e);
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


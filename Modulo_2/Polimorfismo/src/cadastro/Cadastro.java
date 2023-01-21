package cadastro;

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

    public JPanel getPnlMain() throws ParseException {
        pnlMain.setBackground(new Color(1999992));
        btnFisica.addActionListener(this);
        getPnlForm();
        return pnlMain;
    }

    public JPanel getPnlForm() throws ParseException {
        pnlFormFisica = new JPanel();
        pnlFormFisica.setBackground(new Color(289382903));

        lblNome = new JLabel("Nome:");
        lblNome.setBounds(202,100, 240,195);
        txtNome = new JTextField(20);

        lblCpf = new JLabel("CPF:");
        txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));

        lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JFormattedTextField(new MaskFormatter("## (##) #####-####"));

        lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();

        btnFinalizarFisica = new JButton("Próximo");
        btnFinalizarFisica.setBackground(new Color(12938291));

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
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add((pnlFormFisica));
        try {
            getPnlForm().setVisible(true);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }


    public static void main(String[] args) throws ParseException {
        Cadastro cadastro = new Cadastro();
        cadastro.getContentPane().add(cadastro.pnlMain);
        cadastro.setTitle("Sistema de Cadastro");
        cadastro.setVisible(true);
        cadastro.setSize(500, 500);
        cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastro.setLocationRelativeTo(null);
    }


}


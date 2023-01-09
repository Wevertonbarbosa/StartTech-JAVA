package polimorfismo;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;


public class Screen extends JFrame implements ActionListener {

    private JPanel panelConta;
    private JButton btnFisica;
    private JButton btnJuridica;


    private JPanel panelFomr1;

    private JLabel lblName;
    private JTextField txtName;

    private JLabel Cpf;
    private JFormattedTextField txtCPF;

    private JLabel tel;
    private JFormattedTextField txtTel;

    private JLabel email;
    private JFormattedTextField txtEmail;


    public Screen() {
        setTitle("Conta Bancária");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);

        getContentPane().add(getPanelConta());

    }

    public JPanel getPanelConta() {
        if (this.panelConta == null){
            panelConta = new JPanel(new GridLayout(0,1));
            btnFisica = new JButton("Pessoa Física");
            btnJuridica = new JButton("Pessoa Jurídica");
        }
        this.panelConta.add(btnFisica);
        this.panelConta.add(btnJuridica);

        btnFisica.addActionListener(this);

        return panelConta;
    }

    public JPanel getPanelFomr1() throws ParseException {
        if (this.panelFomr1 == null){
            panelFomr1 = new JPanel(new GridLayout(4,2));
            lblName = new JLabel("Digite Nome:");
            txtName = new JTextField(20);

            Cpf = new JLabel("Digite CPF:");
            txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));

            tel = new JLabel("Telefone:");
            txtTel = new JFormattedTextField(new MaskFormatter("## #####-####"));

            email = new JLabel("Digite Email:");
            txtEmail = new JFormattedTextField();

            panelFomr1.add(lblName);
            panelFomr1.add(txtName);

            panelFomr1.add(Cpf);
            panelFomr1.add(txtCPF);

            panelFomr1.add(tel);
            panelFomr1.add(txtTel);

            panelFomr1.add(email);
            panelFomr1.add(txtEmail);
        }


        return panelFomr1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getContentPane().remove(getPanelConta());
        try {
            getContentPane().add(getPanelFomr1());
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }

    }
}

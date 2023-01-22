package cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;

public class Deposito extends JFrame {

    JFrame janelaDeposito;
    private JPanel pnlDeposito;
    private JLabel lblDeposito;
    private JFormattedTextField txtDeposito;
    private JButton btnFinalizarProcesso;

    Cadastro cadastro;
    {
        try {
            cadastro = new Cadastro();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    DadosFC dadosFC = new DadosFC();
    public void campoDeposito() throws ParseException {
        janelaDeposito = new JFrame("Deposito");
        janelaDeposito.setSize(540, 484);
        janelaDeposito.setVisible(false);
        janelaDeposito.setLocationRelativeTo(null);
        janelaDeposito.setResizable(false);
        janelaDeposito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlDeposito = new JPanel();
        pnlDeposito.setLayout(null);
        pack();
        pnlDeposito.setBackground(new Color(0x767E8896, true));

        lblDeposito = new JLabel("Deposito:");
        lblDeposito.setFont(new Font("Arial Black", Font.BOLD, 12));
        lblDeposito.setBounds(60, 28, 200, 20);
        txtDeposito = new JFormattedTextField();
        txtDeposito.setBounds(140, 28, 250, 25);

        btnFinalizarProcesso = new JButton("Finalizar");
        btnFinalizarProcesso.setFont(new Font("Arial Black", Font.BOLD, 15));
        btnFinalizarProcesso.setBounds(160, 150, 170, 35);
        btnFinalizarProcesso.setBackground(new Color(0x1010A2));
        btnFinalizarProcesso.setForeground(new Color(0xFFFFFF));

        btnFinalizarProcesso.addActionListener(this::fisicaOuJuridica);

        pnlDeposito.add(lblDeposito);
        pnlDeposito.add(txtDeposito);

        pnlDeposito.add(btnFinalizarProcesso);

        janelaDeposito.add(pnlDeposito);
    }

    //Discenir quem é fisica/Juridica e Corrente/Poupança
    private void fisicaOuJuridica(ActionEvent actionEvent) {
        if (cadastro.escolheuFisica && cadastro.escolheuCorrente) {
            dadosFC.dadosFimFisica();
            dadosFC.campoFinalFisica.setVisible(true);
        }


    }
}

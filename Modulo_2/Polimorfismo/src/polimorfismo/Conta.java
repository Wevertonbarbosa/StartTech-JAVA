package polimorfismo;

public class Conta extends Pessoa{
    public Conta(String nome, String email, int CPF, int telefone, double deposito) {
        super(nome, email, CPF, telefone, deposito);
    }

    @Override
    public void contaFisica() {
        double chequeEspecial = deposito * 0.1;
        System.out.println(nome + email + CPF + telefone + deposito);
        System.out.println(chequeEspecial);

    }

    @Override
    public void contaJuridica() {
        double rendimento = deposito * 0.05;
        System.out.println(nome + email + CPF + telefone + deposito);
        System.out.println(rendimento);
    }


}

package polimorfismo;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected int CPF;
    protected int telefone;

    protected double deposito;
    public Pessoa(String nome, String email, int CPF, int telefone, double deposito) {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.telefone = telefone;
        this.deposito = deposito;
    }

    public abstract void contaFisica();
    public abstract void contaJuridica();

}

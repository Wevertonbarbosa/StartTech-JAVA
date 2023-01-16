package polimorfismo;

public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected long CPF;
    protected int telefone;
    protected double deposito;

    protected String razaoSocial;
    protected long cnpj;
    public Pessoa() {
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.telefone = telefone;
        this.deposito = deposito;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public  abstract void pessoaFISICA();
    public abstract void pessoaJuridica();

    public abstract void contaCorrente();
    public abstract void contaPoupanca();

}

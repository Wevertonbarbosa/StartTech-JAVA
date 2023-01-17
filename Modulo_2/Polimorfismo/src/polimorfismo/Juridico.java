package polimorfismo;

public class Juridico extends Conta {
    protected String razaoSocial;
    protected long cnpj;

    public Juridico() {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }


    @Override
    public void pessoaJuridica() {
        System.out.println("Digite seu nome Fantasia:");
        this.nome = scanner.nextLine();
        System.out.println("Digite sua Razão social:");
        this.razaoSocial = scanner.nextLine();
        System.out.println("Digite seu CNPJ:");
        this.cnpj = Long.parseLong(scanner.nextLine());
        System.out.println("Digite seu email: ");
        this.email = scanner.nextLine();
        System.out.println("Digite seu Deposito:");
        this.deposito = Double.parseDouble(scanner.nextLine());
    }
}

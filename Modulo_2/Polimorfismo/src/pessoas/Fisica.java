package pessoas;

public class Fisica extends TipoPessoa{
    protected long CPF;
    protected long phone;

    @Override
    public void pessoaFisica() {
        System.out.println("Digite seu nome:");
        this.nome = scanner.nextLine();
        System.out.println("Digite seu CPF:");
        CPF = Long.parseLong(scanner.nextLine());
        System.out.println("Digite seu telefone:");
        phone = Long.parseLong(scanner.nextLine());
        System.out.println("Digite seu email:");
        this.email = scanner.nextLine();
    }

    public void imprimirDadosFisica(){
        System.out.printf("""
                Cliente: %s
                CPF: %d
                Telefone: %d
                Email: %s
                """, this.nome, CPF, phone, email);
    }
}

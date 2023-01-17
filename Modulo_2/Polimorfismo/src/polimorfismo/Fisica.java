package polimorfismo;

public class Fisica extends Conta{
    protected long CPF;
    protected int telefone;

    public Fisica() {
        this.CPF = CPF;
        this.telefone = telefone;
    }

    @Override
    public void pessoaFISICA() {
        System.out.println("Digite o nome do Cliente:");
        this.nome = scanner.nextLine();
        System.out.println("Digite seu CPF:");
        this.CPF = Long.parseLong(scanner.nextLine());
        System.out.println("Digite seu telefone: ");
        this.telefone = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite seu email: ");
        this.email = scanner.nextLine();
        System.out.println("Digite seu deposito:");
        this.deposito = Double.parseDouble(scanner.nextLine());
        System.out.println("""
                1 - Conta Corrente
                2 - Conta Poupança
                
                Digite a conta desejada:
                """);
}


}

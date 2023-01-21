package pessoas;

public class Juridica extends TipoPessoa {
    private String social;
    private long CNPJ;
    @Override
    public void pessoaJuridica() {
        System.out.println("Digite seu Nome Fantasia:");
        this.nome = scanner.nextLine();
        System.out.println("Digite sua Razão Social:");
        social = scanner.nextLine();
        System.out.println("Digite seu CNPJ:");
        CNPJ = Long.parseLong(scanner.nextLine());
        System.out.println("Digite seu email:");
        this.email = scanner.nextLine();
    }

    public void imprimirDadosJuridica(){
        System.out.printf("""
                Nome Fantasia: %s
                Razão Social: %s
                CNPJ: %d
                Email: %s
                """,this.nome,social,CNPJ,this.email);
    }
}

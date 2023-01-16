package polimorfismo;

import java.util.Scanner;

public class Conta extends Pessoa{
    Scanner scanner = new Scanner(System.in);
    int escolhaConta;
    public Conta() {
        int escolhaPessoa;
        System.out.println("""
                1 - Pessoa Fisica
                2 - Pessoa Jurídica
                
                Digite o tipo de cliente desejado:
                """);
        escolhaPessoa = Integer.parseInt(scanner.nextLine());

        if (escolhaPessoa == 1){
            pessoaFISICA();

        }else{
            pessoaJuridica();
            contaPoupanca();
        }

        if (escolhaConta == 1){
            contaCorrente();
        }else {
            contaPoupanca();
        }
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
        this.escolhaConta = Integer.parseInt(scanner.nextLine());
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
        System.out.println("""
                1 - Conta Corrente
                2 - Conta Poupança
                
                Digite a conta desejada:
                """);
        this.escolhaConta = Integer.parseInt(scanner.nextLine());
    }


    @Override
    public void contaCorrente() {
        double chequeEspecial = deposito * 0.1;
        System.out.printf("""
        Cliente: %s 
        email: %s
        CPF: %d 
        telefone: %d
        
        Conta poupança: 1234-5
        Saldo: R$: %.2f
        Cheque especial: R$: %.2f
        """, nome, email, CPF, telefone, deposito, chequeEspecial);

    }

    @Override
    public void contaPoupanca() {
        double rendimento = deposito * 0.005;
        System.out.printf("""
        Cliente: %s 
        email: %s
        CPF: %d 
        telefone: %d
        
        Conta poupança: 1234-5
        Saldo: R$: %.2f
        Rendimento para o próximo mês: %.2f
        """, nome, email, CPF, telefone, deposito, rendimento);;
    }


}

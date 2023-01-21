package contas;

public class ContaPoupanca extends TipoConta {
    @Override
    public void poupanca() {
        System.out.println("Digite o valor do depósito inicial:");
        this.deposito = scanner.nextDouble();
        double rendimento = this.deposito * 0.005;


        System.out.printf("""                      
                Conta corrente: 1234-5
                Saldo: R$: %.2f
                Rendimento ao mês: R$: %.2f
                """, this.deposito, rendimento);
    }
}


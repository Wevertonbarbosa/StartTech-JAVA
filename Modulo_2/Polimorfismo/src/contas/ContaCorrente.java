package contas;

public class ContaCorrente extends TipoConta {
    @Override
    public void corrente() {
        System.out.println("Digite o valor do depósito inicial:");
        this.deposito = scanner.nextDouble();

        double chequeEspecial = this.deposito * 0.01;
        System.out.printf("""
                Conta Corrente: 1234-5
                Saldo: R$: %.2f
                Cheque Especial: R$: %.2f
                """,this.deposito,chequeEspecial);

    }
}

package contas;

import pessoas.TipoPessoa;
public class TipoConta extends TipoPessoa  {
    private int escolhaConta;

    public void inicioConta() {
        System.out.printf("""
                1 - Conta Corrente
                2 - Conta Poupança
                                
                Digite o número da opção desejada:
                """);
        escolhaConta = scanner.nextInt();


        if (escolhaConta == 1) {
            corrente();
        } else if (escolhaConta == 2) {
            poupanca();
        }
    }

    public void corrente() {
        ContaCorrente conta = new ContaCorrente();
        conta.corrente();
    }

    public void poupanca() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.poupanca();
    }
}

package pessoas;

public class TipoPessoa extends Pessoa {
    private int escolhaPessoa;

    public void inicioPessoa() {
        System.out.printf("""
                1 - Pessoa Física
                2 - Pessoa Jurídica
                                
                Digite o número da opção desejada:
                """);
        escolhaPessoa = scanner.nextInt();

        if (escolhaPessoa == 1) {
            pessoaFisica();
        } else if (escolhaPessoa == 2) {
            pessoaJuridica();
        }
    }
    public void pessoaFisica() {
        Fisica f = new Fisica();
        f.pessoaFisica();
    }

    public void pessoaJuridica() {
        Juridica j = new Juridica();
        j.pessoaJuridica();
    }

}

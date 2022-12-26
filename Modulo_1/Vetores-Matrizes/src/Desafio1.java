public class Desafio1 {
    public static void main(String[] args) {

        int quantidadeLetras = 0;
        String maisLetras = "";

        for (String palavra : args) {
            if (palavra.length() > maisLetras.length()) {
                maisLetras = palavra;
                quantidadeLetras = 1;
            } else if (palavra.length() == maisLetras.length()) {
                quantidadeLetras++;
            }
        }

        if (quantidadeLetras > 1) {
            System.out.printf(
                    "Existem %d palavra com %d letras:\n",
                    quantidadeLetras, maisLetras.length()
            );

            for (String palavra : args) {
                if (palavra.length() == maisLetras.length()) {
                    System.out.println(palavra);
                }
            }
        } else {
            System.out.printf("A palavra com a maior quantidade de letras é \"%s\"", maisLetras);
        }

    }

}


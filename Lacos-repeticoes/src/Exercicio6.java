import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        System.out.println("Digite uma letra:");
        String busca = scanner.nextLine();
        char letra = busca.charAt(0);

        int total = 0;


        for (int x = 0; x < palavra.length(); x++) {
            if (palavra.charAt(x) == letra) {
                total = x + 1;
            }
        }
        if (total == 0) {
            System.out.println("Não existem ocorrências da letra " + busca + " Na palavra" + palavra);
        } else if (busca.length() > 1) {
            System.out.println("Erro: Você informou " + palavra + " e " + busca + "" +
                    "Deve-se informar uma única letra para que o programa" +
                    " contabilize as ocorrências em" + palavra);
        }


    }
}

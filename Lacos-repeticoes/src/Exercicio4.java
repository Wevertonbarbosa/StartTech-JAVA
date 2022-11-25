import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[3];
        int[] preco = new int[3];
        int maior = preco.length;
        String maiorName = "";

        for (int x = 0; x < 3; x++) {
            System.out.println("Digite um produto: " + (x + 1));
            produtos[x] = scanner.nextLine();

            System.out.println("Digite o preço do produto, " + produtos[x] + ":");
            preco[x] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Foi informado o produto: " + produtos[x] + ", que custa: R$"
                    + preco[x]);

            if (preco[x] > maior) {
                maior = preco[x];
                maiorName = produtos[x];
            }
        }

        System.out.println("O produto mais caro é: "+ maiorName);

        scanner.close();
    }

}

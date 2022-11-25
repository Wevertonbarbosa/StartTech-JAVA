import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int [] listNumber = new int[8];
        int maior = 0, menor = 999999;

        for (int x = 0; x < listNumber.length; x++) {
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Digite um número: "+ (x + 1));
            listNumber[x] = scanner.nextInt();
            if (listNumber[x] > maior) {
                maior = listNumber[x];
            } else if (listNumber[x] < menor) {
                menor = listNumber[x];
            }
        }
        System.out.println("O maior número é o " + maior + ", e o menor número é o "+ menor);



    }
}
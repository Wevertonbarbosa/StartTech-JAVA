import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        int number, soma = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        number = scanner.nextInt();

        for (int x = 0; x < number; x++) {
            int win = random.nextInt(5) + 1;
            System.out.println("Números sorteado: " + win);
            soma += win;
        }
        System.out.printf("Soma dos números: " + soma);

        scanner.close();
    }
}

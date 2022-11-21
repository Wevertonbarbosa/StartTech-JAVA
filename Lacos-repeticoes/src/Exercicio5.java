import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();
        
        for (int x = 6; ; x++) {
            int win = random.nextInt(5) + 1;
            System.out.println("Foi sorteado o numero: " + win);
        }

    }
}

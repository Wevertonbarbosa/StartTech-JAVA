import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt(), total = 0;
        int win;

        do {
            win = random.nextInt(1, 7);
            System.out.println("Foi sorteado o numero: " + win);
            total++;
        } while (number != win);

        System.out.println("Foram necessários, " + total + " " +
                "sorteios para que o número, " + number + " fosse sorteado.");
    }
}


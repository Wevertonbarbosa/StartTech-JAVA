import java.util.Random;
import java.util.Scanner;

public class Sorteio_ex4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number;
        int play1 = random.nextInt(1, 7);
        int play2 = random.nextInt(1, 7);
        int play3 = random.nextInt(1, 7);

        System.out.println("===========Participe do Jogo===========");
        System.out.println("Escolha um número aleatóriamente de 1 a 6:");
        number = scanner.nextInt();

        if (number == play1 && number == play2 && number == play3) {
            System.out.println("O número selecionado foi o " + number);
            System.out.println("Os número sorteados foram o " + play1 + ", " + play2 + " e " + play3);
            System.out.println("Você teve 3 acertos");
        } else if (number == play2 && number == play3 || number == play2 && number == play1) {
            System.out.println("O número selecionado foi o " + number);
            System.out.println("Os número sorteados foram o " + play1 + ", " + play2 + " e " + play3);
            System.out.println("Voce teve 2 acertos.");
        } else if (number == play1 && number == play2 || number == play1 && number == play3) {
            System.out.println("O número selecionado foi o " + number);
            System.out.println("Os número sorteados foram o " + play1 + ", " + play2 + " e " + play3);
            System.out.println("Voce teve 2 acertos.");
        } else if (number == play3 && number == play1 || number == play3 && number == play2) {
            System.out.println("O número selecionado foi o " + number);
            System.out.println("Os número sorteados foram o " + play1 + ", " + play2 + " e " + play3);
            System.out.println("Você teve 2 acerto!");
        } else if (number == play1 || number == play2 || number == play3) {
            System.out.println("O número selecionado foi o " + number);
            System.out.println("Os número sorteados foram o " + play1 + ", " + play2 + " e " + play3);
            System.out.println("Você teve 1 acerto!");
        } else {
            System.out.println("O número selecionado foi o " + number);
            System.out.println("Os número sorteados foram o " + play1 + ", " + play2 + " e " + play3);
            System.out.println("Você não teve acerto.");
        }

        scanner.close();
    }
}
    
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number;//
        int win = random.nextInt(5) + 1;

        System.out.println("===========Participe do Jogo===========");
        System.out.println("Escolha um número aleatóriamente de 1 a 6:");
        number = scanner.nextInt();
        if (number == win) {
            System.out.println("Parabens! você ganhou.");
            System.out.println("Você selecionou: " + number + ", O número sorteado foi: " + win);
        } else if (number > 6) {
            System.out.println("O número selecionado foi o " + number + ", Erro! Por favor, escolha um número entre 1 e 6." );
        } else if (number != win ) {
            System.out.println("Você selecionou: " + number + ", O número sorteado foi: " + win + " Você errou!");
        }

        scanner.close();
    }
}
    
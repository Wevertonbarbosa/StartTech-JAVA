import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;

        System.out.println("Quantas rodadas você deseja, digite um número: ");
        int number = scanner.nextInt();

        System.out.println("Quantidades de dados no grupo: ");
        int dados = scanner.nextInt();



        for (int x = 0; x < number; x++) {

            for (int j = 0; j < dados; j++) {
                int sorteio = random.nextInt(1,7);
                System.out.print(sorteio);
                total += sorteio;

                if (j < dados - 1 ){
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + total);

        }


        scanner.close();
    }
}

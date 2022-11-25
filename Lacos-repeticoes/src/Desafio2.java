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
        ArrayList<Integer> bankDate = new ArrayList<Integer>();
        bankDate.add(random.nextInt(1,10));

        //Falta terminar o Desafio, Problema(Acertar a parte dos números do Random de uma forma Dinâmica)
        for (int c = 1; c <= number; c++) {

            for (int j = 0; j < dados; j++) {
                System.out.println(bankDate.get(j));

            }

        }


        scanner.close();
    }
}

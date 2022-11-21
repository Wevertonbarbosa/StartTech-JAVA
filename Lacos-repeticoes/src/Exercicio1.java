import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        number = scanner.nextInt();

        for (int x = 0; x < number; x++) {
            if (x % 2 != 0){
                System.out.println(x);
            }
        }
        scanner.close();
    }
}

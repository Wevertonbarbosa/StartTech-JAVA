import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        for (int x = 2; x <= number; x++) {
            boolean primo = true;
            for (int j = 2; j < x; j++) {
                if ( x % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(x);
            }
        }

        scanner.close();
    }
}

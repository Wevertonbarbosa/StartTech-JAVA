import java.util.Scanner;

public class Escada_ex2 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        number = scanner.nextInt();

        int x = 0, c;

        while (x <= number) {
            c = 0;
            while (c < x) {
                System.out.print(number);
                c++;
            }
            System.out.printf("\n");
            x++;
        }

        scanner.close();
    }
}

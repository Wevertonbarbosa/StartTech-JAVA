import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que ano você nasceu?");
        int year = scanner.nextInt();

        int age = 2022 - year;

        System.out.println("Você tem: " + age + " anos");

        scanner.close();
    }
}
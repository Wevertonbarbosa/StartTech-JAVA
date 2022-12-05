import java.util.Scanner;

public class Tabuleiro {
    public static void main(String[] args) {
        String[] x = new String[9];
        String [] o = new String[9];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i  < 9; i++) {
            System.out.println("Digite x ou o para jogar: \n  |  |  \n  |  |  \n  |  |  ");
            x [i] = scanner.next();
            o [i] = scanner.next();
        }
    }
}

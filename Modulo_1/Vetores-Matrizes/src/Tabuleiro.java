import java.util.Scanner;

public class Tabuleiro {
    public static void main(String[] args) {
        String[] value = new String[9];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.println("Preencha o tabuleiro com X ou O: \n  |  |  \n  |  |  \n  |  |  ");
            value[i] = scanner.next();

            if (!value[i].equalsIgnoreCase("x") && !value[i].equalsIgnoreCase("o")
            && !value[i].equalsIgnoreCase("_")) {
                System.out.println("Simbolos aceitos são: X, O, _");
                break;
            }

        }

        for (int x = 0; x <= 6; x+=3 ) {
            System.out.printf("%s | %s | %s \n", value[x], value[x + 1], value[x + 2]);
        }

    }
}

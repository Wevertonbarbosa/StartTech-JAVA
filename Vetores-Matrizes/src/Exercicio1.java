import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] user = new String[9];



        for (int x = 0; x < user.length; x++) {
            System.out.println("Preencha 9 vezes o jogo da velha com X, O, _: "+ (x + 1));
            user[x] = scanner.next();

            if (user.length != 9) {
                System.out.println("Necessário informar 9 símbolo apenas.");
            }

            if (!user[x].equalsIgnoreCase("x") && !user[x].equalsIgnoreCase("o")
                    && !user[x].equalsIgnoreCase("_")) {
                System.out.printf("Símbolos aceitos são: x, o, e _");
            }

            System.out.print(user[x]);
            System.out.print((x+1) % 3 == 0 ? "\n" : " | ");
        }

        //        if (args.length != 9) {
//            System.out.printf("É necessário informar 9 símbolos, mas foram informados %d\n", args.length);
//        }
//
//        for (int i = 0; i < args.length; i++) {
//            if (!args[i].equalsIgnoreCase("o") && !args[i].equalsIgnoreCase("x") &&
//                    !args[i].equalsIgnoreCase("_")
//            ) {
//                System.out.printf("Os únicos símbolos aceitos são \"x\", \"o\" e \"_\", mas foi informado %s\n", args[i]);
//            }
//
//            System.out.print(args[i]);
//            System.out.print((i + 1) % 3 == 0 ? "\n" : " | ");
//        }
    }
}
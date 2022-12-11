import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double answer;
        String answerL;

        System.out.println("Qual é a temperatura?");
        answer = scanner.nextDouble();

        System.out.println("Letra que indica a temperatura?");
        answerL = scanner.next();

        //Se estiver comparando Objeto usa o equals
        //No caso usei o equalsIgnoreCase por conta de receber o as letras em maisculo ou miniscula ele ignora

        if (answerL.equalsIgnoreCase("c")) {
            double resultC = answer * 1.8 + 32;
            System.out.printf("Valor graus em  Fahrenheit: %.2f", resultC);
        } else if (answerL.equalsIgnoreCase("f")) {
                double resultF = (answer - 32) * 5/9;
            System.out.printf("Valor graus em Celsius: %.2f", resultF);
        }else {
            System.out.println("Letra inválida, por favor inserir letra C ou F");
        }

        scanner.close();
    }
}

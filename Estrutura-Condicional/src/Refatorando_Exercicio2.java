import java.util.InputMismatchException;
import java.util.Scanner;

public class Refatorando_Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorTemperatura;
        String letraTemperatura = "";

        System.out.println("Qual é a temperatura?");
        valorTemperatura = scanner.nextDouble();
        System.out.println("Digite C para converter de Celsius para Farenheit ou F de Farenheit para Celsius: ");
        letraTemperatura = scanner.next();

        if (!letraTemperatura.equalsIgnoreCase("c") && !letraTemperatura.equalsIgnoreCase("f")) {
            throw new RuntimeException("É aceito apenas letras, letras aceitas: C ou F.");
        }

        try {
            if (letraTemperatura.equalsIgnoreCase("c")) {
                double valorEmFarenheit = converterFarenheit(valorTemperatura);
                System.out.printf("Valor convertido de Celsius para Farenheit: %.2f", valorEmFarenheit);
            } else if (letraTemperatura.equalsIgnoreCase("f")) {
                double valorEmCelsius = converterCelsius(valorTemperatura);
                System.out.printf("Valor convertido de Farenheit para Celsius: %.2f", valorEmCelsius);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
    public static double converterCelsius(double temperatura) {
        return (temperatura - 32) * 9 / 5;
    }
    public static double converterFarenheit(double temperatura) {
        return temperatura * 1.8 + 32;
    }


}

import java.util.Scanner;

public class Aprovado_Reprovado_ex1 {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota de Lingua Portuguêsa?");
        nota1 = scanner.nextDouble();
        System.out.println("Nota de Matemática");
        nota2 = scanner.nextDouble();
        System.out.println("Nota de Física?");
        nota3 = scanner.nextDouble();
        System.out.println("Nota de Quimica?");
        nota4 = scanner.nextDouble();

        double result = (nota1 + nota2 + nota3 + nota4) / 6;

        if (result >= 6) {
            System.out.printf("O Aluno foi aprovado e sua média foi: %.2f ", result);
        } else {
            System.out.printf("O aluno foi reprovado, sua média foi: %.2f ", result );
        }

        scanner.close();

    }
}
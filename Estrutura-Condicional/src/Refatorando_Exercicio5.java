import java.util.InputMismatchException;
import java.util.Scanner;

public class Refatorando_Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double money = 0;

        while (true) {
            try {
                System.out.println("Digite seu salário?");
                money = scanner.nextDouble();
                if (money == 0) {
                    throw new IllegalArgumentException("Precisa ser maior que 0, para aplicar o desconto no INSS.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas Números, não letras ou caractéres.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }

        if (money < 1212) {
            double descPrimeiro = primeiroCalculo(money);
            System.out.printf("Seu desconto no INSS é: %.2f ", descPrimeiro);
        } else if (money > 1212 && money < 2427.35) {
            double descSegundo = segundoCalculo(money);
            System.out.printf("Seu desconto no INSS é: %.2f ", descSegundo);
        } else if (money >= 2427.35 && money < 3641.03) {
            double descTerceiro = terceiroCalculo(money);
            System.out.printf("Seu desconto no INSS é: %.2f ", descTerceiro);
        } else if (money >= 3641.03 && money < 7087.22) {
            double descQuarto = quartoCalculo(money);
            System.out.printf("Seu desconto no INSS é: %.2f ", descQuarto);
        } else if (money >= 7087.22) {
            double descQuinto = quintoCalculo(money);
            System.out.printf("Seu desconto no INSS é: %.2f ", descQuinto);
        }

        scanner.close();
    }

    public static double primeiroCalculo(double salario) {
        return salario * 0.075;

    }

    public static double segundoCalculo(double salario) {
        return (salario - 1212) * 0.09 + 90.90;
    }

    public static double terceiroCalculo(double salario) {
        double addDesc3 = (2427.35 - 1212) * 0.09;
        double desc3 = (salario - 2427.35) * 0.12;
        double total3 = desc3 + addDesc3 + 90.90;
        return total3;
    }

    public static double quartoCalculo(double salario) {
        double addDesc3 = (2427.35 - 1212) * 0.09;
        double desc4 = (3641.03 - 2427.35) * 0.12;
        double descSalario = (salario - 3641.03) * 0.14;
        double total4 = 90.90 + addDesc3 + desc4 + descSalario;
        return total4;
    }

    public static double quintoCalculo(double salario) {
        double desc5 = (7087.22 - 3641.03) * 0.14;
        double addDesc3 = (2427.35 - 1212) * 0.09;
        double desc4 = (3641.03 - 2427.35) * 0.12;
        double total5 = 90.90 + addDesc3 + desc4 + desc5;
        return total5;
    }


}


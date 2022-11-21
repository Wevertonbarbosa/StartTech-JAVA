import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double money = 0;
        System.out.println("Digite seu salário?");
        money = scanner.nextDouble();

        double addDesc3 = (2427.35 - 1212) * 0.09;//Desconto taxa 9%
        double desc4 = (3641.03 - 2427.35) * 0.12;//Desconto taxa 12%
        double desc5 = (7087.22 - 3641.03) * 0.14;//desconto taxa 14%

        if (money <= 1212) {
            double desc1 = money * 0.075;
            System.out.printf("Seu desconto no INSS é: %.2f ", desc1);
        } else if (money > 1212 && money < 2427.35) {
            double desc2 = (money - 1212) * 0.09 + 90.90;
            System.out.printf("Seu desconto no INSS é: %.2f ", desc2);
        } else if (money >= 2427.35 && money < 3641.03) {
            double desc3 = (money - 2427.35) * 0.12;
            double total3 = desc3 + addDesc3 + 90.90;
            System.out.printf("Seu desconto do INSS foi esse aqui: %.2f ", total3);
        } else if (money >= 3641.03 && money < 7087.22) {    
            double descSalario = (money - 3641.03) * 0.14;
            double total4 = 90.90 + addDesc3 +  desc4 + descSalario;
            System.out.printf("Seu desconto do INSS foi esse aqui: %.2f ", total4);
        }else if (money >= 7087.22) {
            double total5 = 90.90 + addDesc3 + desc4 + desc5;
            System.out.printf("Seu desconto do INSS foi esse aqui: %.2f ", total5);
        }

        scanner.close();
    }
}

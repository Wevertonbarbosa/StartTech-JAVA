import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        DecimalFormat decimal = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        int age, parcelas;
        double salario, emprestimo;

        System.out.println("Sua Idade?");
        age = scanner.nextInt();
        System.out.println("Seu salário?");
        salario = scanner.nextInt();
        System.out.println("Quanto de empréstimo?");
        emprestimo = scanner.nextDouble();
        System.out.println("Em quantas Parcelas?");
        parcelas = scanner.nextInt();

        double porcentagemS = salario * 0.3;//30% da renda da pessoa
        double porcentagemP = (emprestimo * 0.3) / parcelas;//Porcentagem do empréstimo
        double porcentagem = (porcentagemP/salario) * 100;//Conta para obter a porcentagem


        if (age < 18) {
            System.out.println("a idade não pode ser menor a 18 anos.");
        } else if (age > 65) {
            System.out.println("Limite de idade é de 18 até 64 anos.");
        } else if (parcelas < 3) {
            System.out.println("Necessário ser maior que 3 parcelas.");
        } else if (parcelas > 24) {
            System.out.println("A quantidade de parcelas não pode ser superior a 24.");
        } else if (porcentagemS < porcentagemP) {
            System.out.println("O valor da parcela desse empréstimo é de " + decimal.format(porcentagemP) + " reais, " +
                    "e corresponde a %"+decimal.format(porcentagem)+"" +
                    " da sua renda. Esse valor não pode ser superior a 30%.");
        } else {
            System.out.println("Seu empréstimo foi aprovado!");
        }


        scanner.close();
    }
}

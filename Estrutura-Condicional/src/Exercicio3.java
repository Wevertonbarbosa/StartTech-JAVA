import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

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


        if (age < 18 || age > 65 || parcelas < 3 || parcelas < 3 || parcelas > 24) {
            System.out.println("Empréstimo reprovado, você é menor de idade ou excedeu o limite de idade" +
                    " ou as quantidades de parcelas está incoreta. ");
        } else if (porcentagemS < porcentagemP) {
            System.out.println("Empréstimo Reprovado, Saldo não compativel.");
        } else {
            System.out.println("Seu foi empréstimo aprovado!");
        }

        scanner.close();
    }
}

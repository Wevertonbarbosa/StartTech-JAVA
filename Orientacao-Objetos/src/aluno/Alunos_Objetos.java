package aluno;

import java.util.Scanner;

public class Alunos_Objetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Digite o Nome do Aluno: ");
            aluno.nomes[i] = scanner.nextLine();

            for (int x = 0; x < aluno.notas.length; x++) {
                System.out.println("Digite a nota: #" + (x + 1));
                aluno.notas[i] = scanner.nextDouble();
                scanner.nextLine();
            }
        }

        for (int i = 0; i < aluno.nomes.length; i++) {
            System.out.println(aluno.nomes[i] + " teve a média " + aluno.calcularMedia());
        }
    }
}

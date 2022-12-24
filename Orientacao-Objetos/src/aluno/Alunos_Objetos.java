package aluno;

import java.util.Scanner;

public class Alunos_Objetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        double soma = 0;
        double total = 0;

        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println("Digite o nome do aluno: " + (i + 1));
            aluno.nomes = scanner.next();
            for (int j = 0; j < aluno.notas.length; j++) {
                System.out.println("Digite as notas do aluno: " + (j + 1));
                aluno.notas[j] = scanner.nextDouble();
            }

            for (int c = 0; c < aluno.notas.length; c++) {
                soma += aluno.notas[c];
                total = soma / aluno.notas.length;
            }
            System.out.println(total);

        }



    }
}

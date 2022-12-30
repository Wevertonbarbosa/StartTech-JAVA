package aluno;

import utils.Leitor;

public class Alunos_Objetos {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        int qtaAlunos = 3;
        Aluno[] alunos = new Aluno[qtaAlunos];


        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            aluno.setNomes(leitor.lerString("Nome do Aluno: " + (i + 1)));
            aluno.notas[0] = leitor.lerDecimal("Digite a 1º nota do aluno: ");
            aluno.notas[1] = leitor.lerDecimal("Digite a 2º nota do aluno: ");
            aluno.notas[2] = leitor.lerDecimal("Digite a 3º nota do aluno: ");
            alunos[i] = aluno;//Armazena os valores.
        }


        for (Aluno aluno : alunos) {
            System.out.printf("O aluno %s, teve a média: %.2f \n", aluno.getNomes(), aluno.calculandoMedia());
        }


    }
}

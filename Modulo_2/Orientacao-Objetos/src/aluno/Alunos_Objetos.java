package aluno;

import utils.Leitor;

public class Alunos_Objetos {
    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        Aluno[] alunos = new Aluno[qtaAlunos];

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            aluno.nomes(leitor.lerString("Nome do Aluno: " + (i + 1)));
            //Ajustar os atributos com o get e set para validar as informações.....
            aluno.notas[0](leitor.lerDecimal("Digite a nota 1: ");
            aluno.notas[1](leitor.lerDecimal("Digite a nota 2: ");
            aluno.notas[2](leitor.lerDecimal("Digite a nota 3: ");
            alunos[i] = aluno;//Armazena os valores.
        }



//
//        for (Aluno aluno : alunos) {
//            System.out.printf("O aluno, %s teve a média: %.2f \n", aluno.getNomes(), aluno.calculandoMedia());
//        }


    }
}

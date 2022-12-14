package aluno;

public class Aluno {

    String[] nomes = new String[3];
    double[] notas = new double[9];

    double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma/ 3;
    }


}

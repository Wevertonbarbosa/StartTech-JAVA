package aluno;

import utils.Leitor;

public class Aluno {
    private String nomes;

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    double[] notas = new double[3];

    public Aluno() {
        this.nomes = nomes;
        this.notas = notas;

    }



    double calculandoMedia() {
        double media = 0;
        for (double soma : notas) {
            media += soma;
        }
        return media / notas.length;
    }


}

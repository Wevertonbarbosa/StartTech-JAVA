package aluno;

public class Aluno {

   private String nomes;
    public String getNomes() {
        return nomes;
    }
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }


    private double[] notas = new double[3];

    public void setNotas(double[] notas) {
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

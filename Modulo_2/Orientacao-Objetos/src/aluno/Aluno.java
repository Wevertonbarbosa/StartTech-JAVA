package aluno;

public class Aluno {

   public String nomes;
   public final double[] notas = new double[3];

   double calculandoMedia() {
       double media = 0;
       for (double soma : notas) {
           media += soma;
       }
       return media / notas.length;
   }


}

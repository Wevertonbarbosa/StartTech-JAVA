public class Milhas_ex3 {
    public static void main(String[] args) {
        final double MILHA = 0.621371;
        double teste =  Double.parseDouble(args[0]);
        double result = teste * MILHA;
        System.out.println("Resultado em Milha: " + result);
        System.out.println(args);
    }
}

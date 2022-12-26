public class ConversorReais_ex4 {
    public static void main(String[] args) {
        //%.2f Serve para limitar as casas decimais
        //%n pula a linha

        //Money em Dolar
        double moneyBr = Double.parseDouble(args[0]);
        double moneyUSA = Double.parseDouble(args[1]);
        double result1 =  moneyBr/moneyUSA;
        //Desafio (Apenas 2 casas decimais)
        System.out.printf("Resultado em Dolar Americano =  %.2f %n", result1);
        //Money em euros
        double moneyEU = Double.parseDouble(args[1]);
        double result2 =  moneyBr/moneyEU;
        //Desafio (Apenas 2 casas decimais)
        System.out.printf("Resultado em Euros = %.2f %n", result2);

        //Money em Libras
        double moneyLibra = Double.parseDouble(args[1]);
        double result3 =  moneyBr/moneyLibra;
        //Desafio (Apenas 2 casas decimais)
        System.out.printf("Resultado em Libras = %.2f %n", result3);

        //Money em Argentino
        double moneyAR = Double.parseDouble(args[2]);
        double result4 =  moneyBr/moneyAR;
        //Desafio (Apenas 2 casas decimais)
        System.out.printf("Resultado em pesos Argentinos = %.2f %n", result4);

        //Money em coroas Tchecas
        double moneyTC = Double.parseDouble(args[3]);
        double result5 =  moneyBr/moneyTC;
        //Desafio (Apenas 2 casas decimais)
        System.out.printf("Resultado em Coroa Tchecas = %.2f %n", result5);
    }
}

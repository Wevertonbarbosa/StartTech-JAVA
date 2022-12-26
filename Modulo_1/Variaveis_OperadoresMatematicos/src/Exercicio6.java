import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        //Captura da largura
        System.out.println("Qual é a largura da sua piscina?");
        Scanner scanner = new Scanner(System.in);
        double aswerWidth = scanner.nextDouble();

        //Captura da comprimento
        System.out.println("Qual é o comprimento da sua piscina?");
        double aswerLenght = scanner.nextDouble();

        //Desafio 4 valores distintos de profundidade!
        //Captura Profundidade Inicial
        System.out.println("Qual é a profundidade da sua piscina inicialmente?");
        double aswerLenghtStart = scanner.nextDouble();

        //Captura Profundidade Final
        System.out.println("Qual é a profundidade final da sua piscina?");
        double aswerLenghtEnd = scanner.nextDouble();

        //Resultado
        double aswerTotal = (aswerLenghtStart + aswerLenghtEnd)/2 * aswerWidth * aswerLenght;
        double volume = aswerTotal * 1000;
        System.out.println("Essa piscina comporta "+ volume + " Litros de água.");

        //Fechamento dos Scanners
        scanner.close();

    }
}
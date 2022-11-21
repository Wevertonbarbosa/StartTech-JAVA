import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        //Captura da largura
        System.out.println("Qual é a largura da sua piscina?");
        Scanner width = new Scanner(System.in);
        double aswerWidth = width.nextDouble();

        //Captura da comprimento
        System.out.println("Qual é o comprimento da sua piscina?");
        Scanner lenght = new Scanner(System.in);
        double aswerLenght = lenght.nextDouble();

        //Desafio 4 valores distintos de profundidade!
        //Captura Profundidade Inicial
        System.out.println("Qual é a profundidade da sua piscina inicialmente?");
        Scanner lenghtStart = new Scanner(System.in);
        double aswerLenghtStart = lenghtStart.nextDouble();

        //Captura Profundidade Final
        System.out.println("Qual é a profundidade final da sua piscina?");
        Scanner lenghtEnd = new Scanner(System.in);
        double aswerLenghtEnd = lenghtEnd.nextDouble();

        //Resultado
        double aswerTotal = (aswerLenghtStart + aswerLenghtEnd)/2 * aswerWidth * aswerLenght;
        double volume = aswerTotal * 1000;
        System.out.println("Essa piscina comporta "+ volume + " Litros de água.");

        //Fechamento dos Scanners
        width.close();
        lenght.close();
        lenghtStart.close();
        lenghtEnd.close();
    }
}
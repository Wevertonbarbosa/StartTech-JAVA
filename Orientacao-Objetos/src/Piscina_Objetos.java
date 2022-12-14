import java.util.Scanner;

public class Piscina_Objetos {
    public static void main(String[] args) {

        Piscina piscina = new Piscina();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Largura da Piscina: ");
        piscina.largura = scanner.nextDouble();
        System.out.println("Digite o comprimento da Piscina: ");
        piscina.comprimento = scanner.nextDouble();
        System.out.println("Digite a profundidade da Piscina: ");
        piscina.profundide = scanner.nextDouble();
        System.out.println("O volume dessa piscina é: " + piscina.calcularVolume() + "m³");
    }
}
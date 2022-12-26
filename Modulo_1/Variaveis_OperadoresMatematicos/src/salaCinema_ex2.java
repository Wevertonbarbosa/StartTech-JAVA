import java.util.Scanner;

public class salaCinema_ex2 {
    public static void main(String[] args) {

        System.out.println("Quantas fileiras tem no Cinema?");
        Scanner scanner = new Scanner(System.in);
        int fileiras = scanner.nextInt();
        //Cadeiras do Cinema
        int cadeiras = 8;
        //Calculo
        int totalPessoas = fileiras * cadeiras;
        //Desafio 1
        double pcd = 0.1 * totalPessoas;

        System.out.println("A capacidade dessa sala é de " + totalPessoas + " pessoas, sendo que " + pcd +" lugares são reservados para PCDs.");

        scanner.close();

    }
}

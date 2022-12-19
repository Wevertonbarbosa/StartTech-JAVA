package rpg;

public class Jogo_Rpg {
    public static void main(String[] args) {

        Combate combate = new Combate();
        System.out.println("O jogador ataca com a espada! \n"+ combate.calculoDano());

    }
}
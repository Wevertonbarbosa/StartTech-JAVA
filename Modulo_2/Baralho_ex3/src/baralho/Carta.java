package baralho;


import java.util.Random;

public class Carta {

    Random random = new Random();
    private String [] rank;
    private String[] nipe;

    private int sorteioRank = random.nextInt(0,12);
    private int sorteioNipe = random.nextInt(0,3);

    public Carta() {
        this.nipe = new String[]{"Paus", "Copas", "Ouros", "Espada"};
        this.rank = new String[]{"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    }

    @Override
    public String toString() {
        return this.rank[this.sorteioRank] + " de " + this.nipe[this.sorteioNipe];
    }
}

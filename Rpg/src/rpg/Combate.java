package rpg;

import java.util.Random;

public class Combate {

    Random random = new Random();
    public Integer calculoDano() {

        int dadoJogador = random.nextInt(1,8);
        int dadoOrc = random.nextInt(1,12);
        int dadoDaJogadas = random.nextInt(1,20);
        Personagem personagem = new Personagem();

        int ataqueJogador = dadoJogador + dadoDaJogadas + 2;
        int danoNoOrc = ataqueJogador - personagem.orcHp ;

        if (ataqueJogador > personagem.defesa) {
            System.out.println("O ataque foi " + ataqueJogador + " e acertou.\n O orc recebeu " + danoNoOrc + " " +
                    "pontos de dano.");
        }else {
            System.out.println("O ataque foi "+ ataqueJogador + " e errou.");
        }

        return calculoDano();

    }

}

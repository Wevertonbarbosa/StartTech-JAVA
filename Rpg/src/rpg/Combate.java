package rpg;

import java.util.Random;

public class Combate {

    Random random = new Random();

    public void calculoDano() {
        Personagem personagem = new Personagem();
        Random random = new Random();

        while (estiverVivo()) {
            int dadoJogador = random.nextInt(1, 8);
            int dadoDaJogadas = random.nextInt(1, 20);
            int dadoOrc = random.nextInt(1, 12);

            personagem.precisao = dadoDaJogadas + 2;
            personagem.danoJogador = dadoJogador;
            personagem.ataqueOrc = dadoOrc;


            if (personagem.precisao > personagem.defesa) {
                System.out.println("O jogador ataca com a espada!\n O ataque foi " + personagem.precisao + "" +
                        " e acertou.\n O orc recebe " + personagem.danoJogador + " pontos de dano.");
                personagem.sangueOrc -= personagem.danoJogador;
                System.out.println(personagem.sangueOrc);

                if (dadoDaJogadas > personagem.defesa) {
                    System.out.println("O orc ataca com o machado!\n O ataque foi " + dadoDaJogadas + " " +
                            "e acertou.\n O jogador recebe " + dadoOrc + " pontos de dano.");
                    if (personagem.sangueJogador <= 0){
                        System.out.println("O Jogador morreu.");
                        break;
                } else {
                        System.out.println("O orc ataca com o machado! \n O ataque foi "+dadoDaJogadas+ " e errou.");
                    }
            }
            if (personagem.sangueOrc <= 0) {
                System.out.println("O Orc Morreu");
                break;
            }
        } else{
            System.out.println("O jogador ataca com a espada!\n O ataque foi " + personagem.precisao + " " +
                    "e errou.");
        }


    }

}

    boolean estiverVivo() {
        Personagem personagem = new Personagem();
        if (personagem.sangueOrc == 0) {
            System.out.println("O Orc Morreu;");
        }
        return true;
    }
}

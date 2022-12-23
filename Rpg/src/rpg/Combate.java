package rpg;

import java.util.Random;

public class Combate {

    Random random = new Random();

    public void batalhaRodando() {
        Personagem personagem = new Personagem();
        Random random = new Random();
        int dadoJogador;
        int dadoDaJogadas;
        int dadoOrc;
        int contador = 0;


        while (true) {
            dadoJogador = random.nextInt(1, 8);
            dadoDaJogadas = random.nextInt(1, 20);
            dadoOrc = random.nextInt(1, 12);

            personagem.precisao = dadoDaJogadas + 2;
            personagem.danoJogador = dadoJogador;

            contador++;

            if (personagem.precisao > personagem.defesaOrc) {
                System.out.println("Rodada: " + contador + " " +
                        "\nO jogador ataca com a espada!\n O ataque foi " + personagem.precisao + "" +
                        " e acertou.\n O orc recebe " + personagem.danoJogador + " pontos de dano.\n");
                personagem.sangueOrc -= personagem.danoJogador;
                if (personagem.sangueOrc <= 0) {
                    System.out.println("O Orc Morreu \n Parabéns Jogador você venceu!!");
                    break;
                }
            } else {
                System.out.println("Rodada: " + contador + "\n O jogador ataca com a espada!\n O ataque foi " + personagem.precisao + " " +
                        "e errou.\n");
            }

            if (dadoDaJogadas > personagem.defesaJogador) {
                System.out.println("O orc ataca com o machado!\n O ataque foi " + dadoDaJogadas + " " +
                        "e acertou.\n O jogador recebe " + dadoOrc + " pontos de dano.\n");
                personagem.sangueJogador -= dadoOrc;
                if (personagem.sangueJogador <= 0) {
                    System.out.println("O Jogador morreu.\n Parabéns Orc você venceu!! ");
                    break;
                }
            } else {
                System.out.println("O orc ataca com o machado! \n O ataque foi " + dadoDaJogadas + " e errou.\n");
            }

        }

    }

}

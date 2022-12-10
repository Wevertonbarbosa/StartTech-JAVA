import java.util.Random;

public class Alunos {
    public static void main(String[] args) {

        Random random = new Random();
        int gruposQTD = args.length / 3;
        String[][] grupos = new String[gruposQTD][3];

        for (int i = 0; i < gruposQTD; i++) {
            int alunos = 0;
            while (alunos < 3) {
                int sorteio = random.nextInt(0, args.length);

                if (!args[sorteio].equals("")) {
                    grupos[i][alunos] = args[sorteio];
                    alunos++;
                    args[sorteio] = "";
                }
            }
        }

        for (String[] grupo : grupos) {
            System.out.println("Grupo");
            for (String aluno : grupo) {
                System.out.println(aluno);
            }
        }

    }
}

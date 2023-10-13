import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int voto, votoCandidato1 =0, votoCandidato2 =0, votoCandidato3 =0,
            votoCandidato4 =0, votoNulo =0, votoEmbranco =0, totalVotos =0;


        System.out.println("Informe os votos (1, 2, 3, 4 para os respectivos candidatos, 5 para voto nulo, 6 para voto em branco)");

        while (true) {
            voto = input.nextInt();

            if (voto == 0) {
                break;
            } else if (voto >= 1 && voto <= 4) {
                totalVotos ++;

                switch (voto) {
                    case 1:
                        votoCandidato1 ++;
                        break;

                    case 2:
                        votoCandidato2 ++;
                        break;

                    case 3:
                        votoCandidato3 ++;
                        break;

                    case 4:
                        votoCandidato4 ++;
                        break;
                }

            } else if (voto == 5) {
                totalVotos ++;
                votoNulo ++;
            } else if (voto == 6) {
                totalVotos ++;
                votoEmbranco ++;
            } else {
                System.out.println("Código de voto inválido. use de 1 a 6 para votar ou 0 para encerrar");
            }
        }

        System.out.println("o total de votos para candidato 1: " +votoCandidato1+ " \n o total de votos para candidato 2: " +votoCandidato2+
                " \no total de votos para candidato 3: " +votoCandidato3+ " \no total de votos para candidato 4: " +votoCandidato4);
        System.out.println("O total de votos nulos são de: " +votoNulo);
        System.out.println("O total de votos em branco é: " +votoEmbranco);
        System.out.println("a porcentagem de votos nulos sobre o total de votos é: " +(votoNulo * 100.0 / totalVotos)+ "%");
        System.out.println("a porcentagem de votos em branco sobre o total de votos é: " +(votoEmbranco * 100.0 / totalVotos)+ "%");


    input.close();
    }
}
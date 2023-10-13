import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalIdadeOtimo = 0;
        int quantidadeRegular = 0;
        int quantidadeBom = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Informe a idade do espectador " + i + ": ");
            int idade = input.nextInt();

            System.out.println("Informe a opinião do espectador " + i + " (ótimo=3, bom=2, regular=1): ");
            int opiniao = input.nextInt();

            if (opiniao == 3) {
                totalIdadeOtimo += idade;
            } else if (opiniao == 1) {
                quantidadeRegular++;
            } else if (opiniao == 2) {
                quantidadeBom++;
            }
        }

        input.close();

        double mediaIdadeOtimo = (double) totalIdadeOtimo / quantidadeOpiniao(3);
        int percentagemBom = (int) ((double) quantidadeBom / 15 * 100);

        System.out.println("Média de idade das pessoas que responderam ótimo: " + mediaIdadeOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: " + quantidadeRegular);
        System.out.println("Percentagem de pessoas que responderam bom: " + percentagemBom + "%");
    }

    public static int quantidadeOpiniao(int opiniao) {
        int totalOtimo = 0;
        int quantidadeBom = 0;
        int quantidadeRegular = 0;
        return (opiniao == 3) ? totalOtimo : ((opiniao == 2) ? quantidadeBom : quantidadeRegular);
    }
}

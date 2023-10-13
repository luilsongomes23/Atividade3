
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] faixasEtarias = new int[4];
            double[] somasPesos = new double[4];

            for (int i = 1; i <= 15; i++) {
                System.out.print("Digite a idade da pessoa " + i + ": ");
                int idade = input.nextInt();

                System.out.print("Digite o peso da pessoa " + i + ": ");
                double peso = input.nextDouble();

                if (idade >= 1 && idade <= 10) {
                    faixasEtarias[0]++;
                    somasPesos[0] += peso;
                } else if (idade >= 11 && idade <= 20) {
                    faixasEtarias[1]++;
                    somasPesos[1] += peso;
                } else if (idade >= 21 && idade <= 30) {
                    faixasEtarias[2]++;
                    somasPesos[2] += peso;
                } else {
                    faixasEtarias[3]++;
                    somasPesos[3] += peso;
                }
            }

            System.out.println("\nMédias de pesos por faixa etária:");

            for (int i = 0; i < 4; i++) {
                double mediaPeso = (faixasEtarias[i] > 0) ? somasPesos[i] / faixasEtarias[i] : 0;
                String faixaEtaria = obterFaixaEtaria(i);
                System.out.println(faixaEtaria + ": " + mediaPeso);
            }

        input.close();
        }

        public static String obterFaixaEtaria(int indice) {
            switch (indice) {
                case 0:
                    return "1 a 10 anos";
                case 1:
                    return "11 a 20 anos";
                case 2:
                    return "21 a 30 anos";
                case 3:
                    return "31 anos para cima";
                default:
                    return "Faixa etária desconhecida";
            }
        }
    }



import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        System.out.print("Informe o valor do carro: ");
        double valorCarro = input.nextDouble();

        double descontoAVista = 0.20;

        System.out.println("\nTabela de Preços:");
        System.out.println("Parcelas\tPreço Final\tValor da Parcela");

        for (int parcelas = 1; parcelas <= 60; parcelas++) {
            double precoFinal;
            double valorParcela;

            if (parcelas == 1) {
                precoFinal = valorCarro * (1 - descontoAVista);
                valorParcela = precoFinal;
            } else {
                double acrescimo = obterPercentualAcrescimo(parcelas);
                precoFinal = valorCarro * (1 + acrescimo);

                // Cálculo do valor da parcela
                valorParcela = precoFinal / parcelas;
            }

            System.out.println(parcelas + "\t\t" + decimalFormat.format(precoFinal) + "\t\t" + decimalFormat.format(valorParcela));
        }

        input.close();
    }

    public static double obterPercentualAcrescimo(int parcelas) {
        double[] percentuaisAcrescimo = {0, 0.02, 0.04, 0.06, 0.08, 0.1, 0.12, 0.14, 0.16, 0.18};

        if (parcelas >= 6 && parcelas <= 60) {
            return percentuaisAcrescimo[(parcelas - 6) / 6];
        }

        return 0;
    }
}

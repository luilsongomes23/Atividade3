import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pessoasComMaisDe50 = 0;
        double somaAlturas = 0;
        int pessoasEntre10e20 = 0;
        int pessoasComPesoInferior40kg = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Informe a idade: ");
            int idade = input.nextInt();

            System.out.print("Informe a altura (em metros): ");
            double altura = input.nextDouble();

            System.out.print("Informe o peso (em kg): ");
            double peso = input.nextDouble();

            if (idade > 50) {
                pessoasComMaisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                pessoasEntre10e20++;
            }

            if (peso < 40) {
                pessoasComPesoInferior40kg++;
            }
        }

        System.out.println("\nQuantidade de pessoas com idade superior a 50 anos: " + pessoasComMaisDe50);

        double mediaAlturas = (pessoasEntre10e20 > 0) ? somaAlturas / pessoasEntre10e20 : 0;
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas + " metros");

        double porcentagemPesoInferior40kg = (pessoasComPesoInferior40kg * 100.0) / 5;
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + porcentagemPesoInferior40kg + "%");

        input.close();
    }
}

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, pessoaAge50Peso60Menos = 0, pessoasOlhosAzuis =0,pessoasRuivasNotBlueEyes =0;
        double peso, altura, somaIdadeMenos50 =0, pessoaMenos150 =0, mediaIdadeMenos150 =0, somaMenos150 =0, porcetBlueEyes;
        char corOlhos, corCabelos;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Pessoa " +i+ ":");

            System.out.println("Informe sua idade: ");
            idade = input.nextInt();

            System.out.println("Informe sua altura: ");
            altura = input.nextDouble();

            System.out.println("Informe o seu peso: ");
            peso = input.nextDouble();

            System.out.println("Informe a cor do seu olho  (A — azul; P — preto; V — verde; e C — castanho)");
            corOlhos = input.next().charAt(0);

            System.out.println("Informe a cor de seu cabelo s (P — preto; C — castanho; L — louro; e R — ruivo)");
            corCabelos = input.next().charAt(0);

            if (idade > 50 && peso < 60) {
                pessoaAge50Peso60Menos++;

            }
            if (altura < 1.50) {
                somaIdadeMenos50+= idade;
                pessoaMenos150++;
            }
            if (corOlhos == 'A' || corOlhos == 'a') {
            pessoasOlhosAzuis++;
            }
            if (corCabelos == 'R' || corCabelos == 'r' && corOlhos != 'A' && corOlhos != 'a') {
                pessoasRuivasNotBlueEyes++;
            }

        }

        System.out.println("Quantidade de pessoa com idade acima de 50 e peso menor que 60: " +pessoaAge50Peso60Menos);

        mediaIdadeMenos150 = (pessoaMenos150 > 0) ? somaMenos150 / pessoaMenos150 : 0;
        System.out.println("A media de pessoa com altura abaixo de 1.50: " + mediaIdadeMenos150);

        porcetBlueEyes = (pessoasOlhosAzuis * 100.0) /6;
        System.out.println("a porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; " +porcetBlueEyes);


        System.out.println("a quantidade de pessoas ruivas e que não possuem olhos azuis: " +pessoasRuivasNotBlueEyes);



    input.close();
    }
}
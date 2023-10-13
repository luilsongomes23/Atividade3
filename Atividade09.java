import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, somIdade =0, numPessoas =0;
        double peso, altura, qtdPessoasAcima90Abaixo150 =0, pessoasIdade10a30AlturaMais190=0, PessoaAltura190 =0, mediaIdade10Pessoas =0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Pessoa: " +i);

            System.out.print("Informe sua idade: ");
            idade = input.nextInt();

            System.out.print("Informe seu peso: ");
            peso = input.nextDouble();

            System.out.print("Informe sua altura: ");
            altura = input.nextDouble();

            somIdade += idade;

            if (peso > 90 && altura < 1.50) {
                qtdPessoasAcima90Abaixo150++;
            }
            if (altura > 1.90) {
                PessoaAltura190++;
            }
            if (mediaIdade10Pessoas > 10 && idade < 30) {
                pessoasIdade10a30AlturaMais190++;
            }

            mediaIdade10Pessoas = (double) somIdade / numPessoas;
            System.out.println("A media de idade de 10 pessoas é: " +mediaIdade10Pessoas);

            System.out.println("a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro: " +qtdPessoasAcima90Abaixo150);

            pessoasIdade10a30AlturaMais190 = (PessoaAltura190 > 0) ? (double) pessoasIdade10a30AlturaMais190 + PessoaAltura190 * 100.0 : 0;
            System.out.println("a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + pessoasIdade10a30AlturaMais190);




        }



    input.close();
    }
}
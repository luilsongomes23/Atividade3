import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, novaIdade, somaIdade =0, quantidadeIdade =0;
        double mediaIdade;

        System.out.println("Informe as idade (Digite 0 para encerrar)");

        while (true) {
            idade = input.nextInt();

            if (idade == 0) {
                break;
            }

            somaIdade += idade;
            quantidadeIdade++;

            if (quantidadeIdade > 0) {
                mediaIdade = (double) somaIdade / quantidadeIdade;
                System.out.println("A media das idade digitadas é: " +mediaIdade);
            } else {
                System.out.println("Nenhuma idade foi digitada.");
            }




        }




    input.close();


    }
}
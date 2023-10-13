import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;
        double mediaAritmetica, mediaPonderada;

        do {
            System.out.println(" Menu das opções: \n" + "1 - Média aritmética \n" + "2 - Média ponderada \n" + "3 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                calcularMediaAritmetica(input);
                break;

                case 2:
                    calcularMediaPonderada(input);
                break;

                case 3:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção invalida tente novamente.");
            }

        } while (opcao != 3) ;

    input.close();

    }

    private static void calcularMediaAritmetica(Scanner input) {
    double nota1, nota2, mediaArit;

        System.out.print("Informe a nota 1: ");
        System.out.print("Informe a nota 2: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();

        mediaArit = (nota1 + nota2) /2;

        System.out.print("A média aritmética é: " +mediaArit + "\n \n");
    }
    private static void calcularMediaPonderada(Scanner input) {

        double nota1, nota2, nota3, mediaPond, peso1, peso2, peso3, somaPesos;

        System.out.print("Informe a nota 1: ");
        System.out.print("Informe a nota 2: ");
        System.out.print("Informe a nota 3: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();

        System.out.print("Informe o peso da nota 1: ");
        System.out.print("Informe o peso da nota 2: ");
        System.out.print("Informe o peso da nota 3: ");
        peso1 = input.nextDouble();
        peso2 = input.nextDouble();
        peso3 = input.nextDouble();

        somaPesos = peso1 + peso2 + peso3;

        mediaPond = (nota1 + nota2 + nota3 + peso1 + peso2 + peso3) / somaPesos;

        System.out.println("Média ponderada: " + mediaPond + "\n \n");

    }


}

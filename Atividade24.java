import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        System.out.print("Informe um número inteiro e positivo (Insira 0 para encerrar: ");

        while(true) {
            numero = input.nextInt();

            if (numero < 0) {
                System.out.println("Valor negativo, so pode número positivos.");
            } else if (numero == 0 ) {
                break;
            } else {
                if (numero > maior){
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

            }

        }

        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor valido foi inserido.");
        } else {
            System.out.print("Maior valor: " +maior);
            System.out.print("Menor valor: " +menor);

        }

    input.close();
    }
}
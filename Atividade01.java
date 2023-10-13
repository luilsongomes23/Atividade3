import java.util.Scanner;
import java.util.Arrays;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] grupos = new int[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os valores do grupo " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor " + (j + 1) + ": ");
                grupos[i][j] = input.nextInt();
            }
        }

        System.out.println("Grupos na ordem lida:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(grupos[i]));
        }

        for (int i = 0; i < 5; i++) {
            Arrays.sort(grupos[i]);
        }

        System.out.println("Grupos em ordem crescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(grupos[i]));
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 / 2; j++) {
                int temp = grupos[i][j];
                grupos[i][j] = grupos[i][3 - j];
                grupos[i][3 - j] = temp;
            }
        }

        System.out.println("Grupos em ordem decrescente:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(grupos[i]));
        }

        input.close();
    }
}
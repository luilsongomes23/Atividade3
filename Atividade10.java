import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, somaPares = 0, somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º número: ");
            numero = input.nextInt();

            if (ehPar(numero)) {
                somaPares += numero;
            }
            if (ehPrimo(numero)) {
                somaPrimos += numero;
            }

        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números primos: " + somaPrimos);

        input.close();


    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
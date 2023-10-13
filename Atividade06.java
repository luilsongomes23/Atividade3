import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char codigo;
        double valor, totalComprasAVista = 0, totalComprasAoPrazo = 0, totalDeComprasEfetuadas = 0, totalDePrestacao;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Informe qual o codigo de transação( V para a vista e P para prazo) " +i+ ":");
            codigo = input.next().charAt(0);

            System.out.println("Informe o valor da compra " +i+ ":");
            valor = input.nextDouble();

            if (codigo == 'V' || codigo == 'v') {
                System.out.println("Pagamento a vista");
                totalComprasAVista += valor;
                System.out.println("O total de compras a vista é: " +totalComprasAVista);

            } else if (codigo == 'P' || codigo == 'p') {
                System.out.println("Pagamento com prazo");
                totalComprasAoPrazo += valor;
                System.out.println("O total de compras ao prazo é:" +totalComprasAoPrazo);

            } else {
                System.out.println("Codigo invalido tente usar (V para a vista e P para prazo)");
                i--;
            }

        }

        totalDeComprasEfetuadas = totalComprasAoPrazo + totalComprasAVista;
        totalDePrestacao = totalComprasAoPrazo / 3;

        System.out.println("O valor total da compra é de: " +totalDeComprasEfetuadas);
        System.out.println("O valor da prestação é: " +totalDePrestacao);





    input.close();
    }

}

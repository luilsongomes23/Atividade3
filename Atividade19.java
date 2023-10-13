import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipoDeAcao;
        double precoDaCompra =0, precoDaVenda =0, lucroAcao, acoesComLucroSuperior1000 = 0, acoesComLucroInferior200 = 0;
        double lucroTotalEmpresa =0;

        System.out.print("Informe o tipo de ação ('F' para finalizar):");

        while (true) {
            tipoDeAcao = input.next().charAt(0);

            if (tipoDeAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço da compra da ação: ");
            precoDaCompra = input.nextDouble();

            System.out.print("Digite o preço da venda da ação: ");
            precoDaCompra = input.nextDouble();

            lucroAcao = precoDaVenda - precoDaCompra;
            lucroTotalEmpresa ++;

            System.out.println("O lucro da ação é: " +lucroAcao+ "R$");

            if (lucroAcao > 1000) {
                acoesComLucroSuperior1000++;
            }
            if (lucroAcao < 200) {
                acoesComLucroInferior200++;
            }

        }


        System.out.println("A quantidade de ações com lucro superiro a R$ 1000: " +acoesComLucroSuperior1000);
        System.out.println("A quantidade de ações com lucro inferior a R$ 200: " +acoesComLucroInferior200);
        System.out.println("O lucro total da empresa é: R$ " +lucroTotalEmpresa);

        input.close();
    }
}
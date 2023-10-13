public class Atividade02 {
    public static void main(String[] args) {
        double precoIngresso = 5.00;
        double precoMinimo = 1.00;
        double decremento = 0.50;

        double lucroMaximo = 0.0;
        double precoLucroMaximo = 0.0;
        int ingressosVendidosLucroMaximo = 0;

        System.out.println("Preço do Ingresso | Quantidade de Ingressos Vendidos | Lucro Esperado");
        System.out.println("---------------------------------------------------------------------");

        while (precoIngresso >= precoMinimo) {
            int ingressosVendidos = 120 + (int) ((5.00 - precoIngresso) / 0.50) * 26;

            double lucro = (precoIngresso * ingressosVendidos) - 200.00;

            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoLucroMaximo = precoIngresso;
                ingressosVendidosLucroMaximo = ingressosVendidos;
            }

            System.out.printf("%.2f              | %d              | %.2f%n", precoIngresso, ingressosVendidos, lucro);

            precoIngresso -= decremento;
        }

        System.out.println("\nLucro Máximo Esperado:");
        System.out.println("Preço do Ingresso: R$" + precoLucroMaximo);
        System.out.println("Quantidade de Ingressos Vendidos: " + ingressosVendidosLucroMaximo);
        System.out.println("Lucro Esperado: R$" + lucroMaximo);
    }
}
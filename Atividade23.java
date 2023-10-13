import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao, mesesTrabalhados;
        double  salario, novoSalario, valorFerias, decimoTerceiro;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("Digite o salário do funcionário: R$ ");
                     salario = input.nextDouble();

                     novoSalario = calcularNovoSalario(salario);

                    System.out.println("Novo salário: R$ " + novoSalario);
                    break;
                case 2:

                    System.out.print("Digite o salário do funcionário: R$ ");
                    salario = input.nextDouble();

                     valorFerias = calcularValorFerias(salario);

                    System.out.println("Valor das férias: R$ " + valorFerias);
                    break;
                case 3:

                    System.out.print("Digite o salário do funcionário: R$ ");
                    salario = input.nextDouble();

                    System.out.print("Digite o número de meses de trabalho (até 12): ");
                     mesesTrabalhados = input.nextInt();

                    decimoTerceiro = calcularValorDecimoTerceiro(salario, mesesTrabalhados);
                    System.out.println("Valor do décimo terceiro: R$ " + decimoTerceiro);
                    break;
                case 4:

                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        input.close();
    }

    public static double calcularNovoSalario(double salario) {
        if (salario <= 210.00) {
            return salario * 1.15;
        } else if (salario <= 600.00) {
            return salario * 1.10;
        } else {
            return salario * 1.05;
        }
    }

    public static double calcularValorFerias(double salario) {
        return salario + (salario / 3.0);
    }

    public static double calcularValorDecimoTerceiro(double salario, int mesesTrabalhados) {
        return (salario * mesesTrabalhados) / 12.0;
    }
}

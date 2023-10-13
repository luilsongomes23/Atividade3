import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] faixaetarias = new int[5];
        int totalDePessoas = 0, age = 0;
        double porcetagemPrimeiraFaixa, porcentagemUltimaFaixa = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa: ");
            age = input.nextInt();
        }

        if (age <= 15) {
            faixaetarias[0]++;
        } else if (age >= 16 && age <= 30) {
            faixaetarias[1]++;
        } else if (age >= 31 && age <= 45) {
            faixaetarias[2]++;
        } else if (age >= 46 && age <= 60) {
            faixaetarias[3]++;
        } else {
            faixaetarias[4]++;
        }

        System.out.println("Quntidade de pessoa em cada faixa taria");
        System.out.println("faxetaria 1° (Até 15 anos)" +faixaetarias[0]+ " pessoas");
        System.out.println("faxetaria 1° (16 anos ate 30 anos)" +faixaetarias[1]+ " pessoas");
        System.out.println("faxetaria 1° (31 a 45 anos)" +faixaetarias[2]+ " pessoas");
        System.out.println("faxetaria 1° (45 a 60 anos)" +faixaetarias[3]+ " pessoas");
        System.out.println("faxetaria 1° (Acima de 60 anos)" +faixaetarias[4]+ " pessoas");

        porcetagemPrimeiraFaixa = (faixaetarias[0] * 100) / totalDePessoas;
        porcentagemUltimaFaixa  = (faixaetarias[0] * 100) / totalDePessoas;

        System.out.println("O total de pessoa na faixa etaria 1 é: " +porcetagemPrimeiraFaixa+ "%");
        System.out.println("O total de pessoa na faixa etaria 5 é: " +porcentagemUltimaFaixa+ "%");



        input.close();
    }
}

import java.util.Scanner;
import java.util.Locale;

public class program {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int countCem = 0; // contador de cem
        int countCinq = 0; // contador de cinquenta
        int countVinte = 0; // contador de vinte
        int countDez = 0; // contador de dez
        int countCinco = 0; // contador de cinco
        int countDois = 0; // contador de dois

        int countUm = 0; // contador de um
        int countCinqCents = 0; // contador de cinquenta centavos
        int countVinCents = 0; // contador de vinte e cinco centavos
        int countDezCents = 0; // contador de dez centavos
        int countCincCents = 0; // contador de cinco centavos
        int countUmCents = 0; // contador de um centavo

        if (valor > 1.00) {
            while (valor > 100.00) {
                valor -= 100; // calculo do valorCem
                countCem += 1;
            }
            while (valor > 50.00) {
                valor -= 50; // calculo do valorCinq
                countCinq += 1;
            }
            while (valor > 20.00) {
                valor -= 20; // calculo do valorVinte
                countVinte += 1;
            }
            while (valor > 10.00) {
                valor -= 10; // calculo do valorDez
                countDez += 1;
            }
            while (valor > 5.00) {
                valor -= 5; // calculo do valorCinco
                countCinco += 1;
            }
            while (valor > 2.00) {
                valor -= 2; // calculo do valorDois
                countDois += 1;
            }
        }
        if (valor < 1.00) {
            while (valor > 1.00) {
                valor -= 1.00; // calculo do valorCem
                countUm += 1;
            }
            while (valor > 0.50) {
                valor -= 0.50; // calculo do valorCinq
                countCinqCents += 1;
            }
            while (valor > 0.25) {
                valor -= 0.25; // calculo do valorVinte
                countVinCents += 1;
            }
            while (valor > 0.10) {
                valor -= 0.10; // calculo do valorDez
                countDezCents += 1;
            }
            while (valor > 0.05) {
                valor -= 0.05; // calculo do valorCinco
                countCincCents += 1;
            }
            while (valor > 0.01) {
                valor -= 0.01; // calculo do valorDois
                countUmCents += 1;
            }

        }

        System.out.println("NOTAS:");
        System.out.println(countCem + " nota(s) de R$ 100.00");
        System.out.println(countCinq + " nota(s) de R$ 50.00");
        System.out.println(countVinte + " nota(s) de R$ 20.00");
        System.out.println(countDez + " nota(s) de R$ 10.00");
        System.out.println(countCinco + " nota(s) de R$ 5.00");
        System.out.println(countDois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(countUm + " moeda(s) de R$ 1.00");
        System.out.println(countCinqCents + " moeda(s) de R$ 0.50");
        System.out.println(countVinCents + " moeda(s) de R$ 0.25");
        System.out.println(countDezCents + " moeda(s) de R$ 0.10");
        System.out.println(countCincCents + " moeda(s) de R$ 0.05");
        System.out.println(countUmCents + " moeda(s) de R$ 0.01");

        sc.close();

    }
}

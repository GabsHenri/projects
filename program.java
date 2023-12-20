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

        while (valor > 100.00) {
            valor -= 100; // calculo do valor
            countCem += 1;
        }
        while (valor > 50.00) {
            valor -= 50; // calculo do valor
            countCinq += 1;
        }
        while (valor > 20.00) {
            valor -= 20; // calculo do valor
            countVinte += 1;
        }
        while (valor > 10.00) {
            valor -= 10; // calculo do valor
            countDez += 1;
        }
        while (valor > 5.00) {
            valor -= 5; // calculo do valor
            countCinco += 1;
        }
        while (valor > 2.00) {
            valor -= 2; // calculo do valor
            countDois += 1;
        }

        System.out.println(countCem + " nota(s) de R$ 100.00");
        System.out.println(countCinq + " nota(s) de R$ 50.00");
        System.out.println(countVinte + " nota(s) de R$ 20.00");
        System.out.println(countDez + " nota(s) de R$ 10.00");
        System.out.println(countCinco + " nota(s) de R$ 5.00");
        System.out.println(countDois + " nota(s) de R$ 2.00");

        sc.close();

    }
}

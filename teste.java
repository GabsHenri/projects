import java.util.Scanner;
import java.util.Locale;

public class teste {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble(); // valor inserido
        int[] notas = { 100, 50, 20, 10, 5, 2 }; // notas

        int count = 0;
        for (int i = 0; i < notas.length; i++) {
            double q = (valor / notas[i]);
            System.out.println((int) q);
            valor -= (q * notas[i]);
        }

        sc.close();
    }
}
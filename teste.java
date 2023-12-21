import java.util.Scanner;
import java.util.Locale;

public class teste {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble(); // valor inserido pelo usuário
        double[] valores = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

        for (int i = 0; i < valores.length; i++) {
            int quantidade = (int) (valor / valores[i]);
            valor -= quantidade * valores[i];

            if (quantidade > 0) {
                System.out.println(quantidade);
            }
        }

        sc.close();
    }
}
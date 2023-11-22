package script;

import java.util.Locale;
import java.util.Scanner;
import application.Product;

public class program {
    public static void main(String[] args0) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double number = sc.nextDouble();
            vect[i] = new Product(number);
        }

        sc.nextLine();
        System.out.print("Valores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect[i]);
        }

        double soma = 0.0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            soma += vect[i].getNumber();
        }
        System.out.printf("Soma: %.2f%n", soma);
        double media = soma / n;
        System.out.printf("Média: %.2f%n", media);
        sc.close();
    }
}
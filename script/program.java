package script;

import java.util.Locale;
import java.util.Scanner;
import application.Product;

public class program {
    public static void main(String[] args0) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Digite o valor da nota fiscal: ");
        product.a = sc.nextDouble();
        System.out.print("Digite o valor da retenção da NFSE: ");
        product.b = sc.nextDouble();
        System.out.printf("O valor final da NFSE é: %.2f%n", product.calculator());
        System.out.println("-----------------------------------");
        sc.nextLine();
        product.condicao();
        sc.close();
    }
}
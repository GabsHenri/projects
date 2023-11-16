package application;

public class Product {
    public double a;
    public double b;

    public double calculator() {
        double calc = a - imposto();
        return calc;
    }

    public void condicao() {
        if (b == 3.0) {
            System.out.printf("O valor do COFINS retido na NFSE é: %.2f%n", imposto());

        } else if (b == 0.65) {
            System.out.printf("O valor do PIS retido na NFSE é: %.2f%n", imposto());

        } else if (b == 1.5) {
            System.out.printf("O valor do IRRF retido na NFSE é: %.2f%n", imposto());

        } else if (b == 1.0) {
            System.out.printf("O valor do CSLL retido na NFSE é: %.2f%n", imposto());

        } else {
            System.out.println("Não houve retenção da NFSE.");
        }
    }

    public double imposto() {
        return (b / 100) * a;
    }
}
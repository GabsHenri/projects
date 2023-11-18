import java.util.Scanner;
import java.util.Locale;
import entities.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();

        System.out.print("Digite o valor da nota fiscal: ");
        calc.a = sc.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println("Digite o valor das retenções da NFSE: ");
        System.out.println("-----------------------------------");
        System.out.print("PIS: ");
        calc.retPis = sc.nextDouble();
        System.out.print("COFINS: ");
        calc.retCof = sc.nextDouble();
        System.out.print("IRRF: ");
        calc.retIrrf = sc.nextDouble();
        System.out.print("CSLL: ");
        calc.retCsll = sc.nextDouble();
        System.out.printf("O valor final da NFSE é: %.2f%n", calc.calculator());
        System.out.println("-----------------------------------");
        sc.nextLine();
        calc.condicao();
        sc.close();
	}


}
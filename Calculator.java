package entities;

public class Calculator {
	
	public double a;
    public double retPis;
    public double retCof;
    public double retIrrf;
    public double retCsll;

    public double calculator() {
        double calc = a - somaRet();
        return calc;
    }
    
    public double calcPis() {
    	return (retPis / 100) * a;
       
    }
    public double calcCof() {
    	return (retCof / 100) * a;
    }
    public double calcIr() {
    	return (retIrrf / 100) * a;
    }
    public double calcCs() {
    	return (retCsll / 100) * a;
    }
    
    public double somaRet() {
    	return calcPis() + calcCof() + calcIr() + calcCs();
    }
    	
    public void condicao() {
        System.out.printf("O valor do COFINS retido na NFSE é: %.2f%n", calcCof());
        System.out.printf("O valor do PIS retido na NFSE é: %.2f%n", calcPis());
        System.out.printf("O valor do IRRF retido na NFSE é: %.2f%n", calcIr());
        System.out.printf("O valor do CSLL retido na NFSE é: %.2f%n", calcCs());
        System.out.println("Não houve retenção da NFSE.");
        
    }
}




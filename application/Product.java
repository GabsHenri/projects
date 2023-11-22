package application;

public class Product {
    private double number;

    public Product(double number) {
        this.number = number;
    }

    public String toString() {
        return getNumber()
                + "  ";
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

}
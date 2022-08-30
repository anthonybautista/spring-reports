package wctc.java.abautista;

public class Country {
    private String name;
    private double saleAmount;
    private double salesTax;
    private double shipping;

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public Country(String name, double saleAmount, double salesTax, double shipping) {
        this.name = name;
        this.saleAmount = saleAmount;
        this.salesTax = salesTax;
        this.shipping = shipping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }
}

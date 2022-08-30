package wctc.java.abautista;

public class Sale {
    private String name;
    private String country;
    private double saleAmount;
    private double salesTax;
    private double shipping;

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public Sale(String name, String country, double saleAmount, double salesTax) {
        this.name = name;
        this.country = country;
        this.saleAmount = saleAmount;
        this.salesTax = salesTax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

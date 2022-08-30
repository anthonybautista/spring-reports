package wctc.java.abautista.impl;

import wctc.java.abautista.Country;
import wctc.java.abautista.Sale;
import wctc.java.abautista.iface.SalesReport;

import java.util.ArrayList;
import java.util.List;

public class SummaryReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        List<Country> countryList = new ArrayList<>();
        List<String> countries = new ArrayList<>();

        for(Sale aSale : salesList) {
            if (!countries.contains(aSale.getCountry())) {
                Country newCountry = new Country(aSale.getCountry(), aSale.getSaleAmount(), aSale.getSalesTax(), aSale.getShipping());
                countryList.add(newCountry);
                countries.add(aSale.getCountry());
            } else {
                for(Country country : countryList) {
                    if (country.getName().equals(aSale.getCountry())){
                        country.setSaleAmount(country.getSaleAmount() + aSale.getSaleAmount());
                        country.setSalesTax(country.getSalesTax() + aSale.getSalesTax());
                        country.setShipping(country.getShipping() + aSale.getShipping());
                    }
                }
            }
        }

        System.out.println("SALES SUMMARY REPORT");
        System.out.println("Country          Amount         Tax        Shipping");
        for(Country country : countryList) {
            String detailLine = String.format("%-17s", country.getName());
            detailLine = detailLine + String.format("%-15s", country.getSaleAmount());
            detailLine = detailLine + String.format("%-11s", country.getSalesTax());
            detailLine = detailLine + String.format("%.2f", country.getShipping());
            System.out.println(detailLine);
        }
    }
}

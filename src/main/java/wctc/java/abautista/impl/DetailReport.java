package wctc.java.abautista.impl;

import wctc.java.abautista.Sale;
import wctc.java.abautista.iface.SalesReport;

import java.util.List;

public class DetailReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.println("Customer                    Country                 Amount         Tax        Shipping");
        for(Sale aSale : salesList) {
            String detailLine = String.format("%-28s", aSale.getName());
            detailLine = detailLine + String.format("%-24s", aSale.getCountry());
            detailLine = detailLine + String.format("%-15s", aSale.getSaleAmount());
            detailLine = detailLine + String.format("%-11s", aSale.getSalesTax());
            detailLine = detailLine + String.format("%.2f",aSale.getShipping());
            System.out.println(detailLine);
        }
    }
}

package wctc.java.abautista.iface;

import wctc.java.abautista.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}

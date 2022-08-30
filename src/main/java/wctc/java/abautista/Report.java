package wctc.java.abautista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wctc.java.abautista.iface.SalesInput;
import wctc.java.abautista.iface.SalesReport;
import wctc.java.abautista.iface.ShippingPolicy;

import java.util.List;

@Component
public class Report {
    private SalesInput in;
    private SalesReport out;
    private ShippingPolicy shipping;

    @Autowired
    public Report(SalesInput in, SalesReport out, ShippingPolicy shipping) {
        this.in = in;
        this.out = out;
        this.shipping = shipping;
        System.out.println("DiceGame created");
    }
    public void run() {
        System.out.println("Report Initialized!");
        List<Sale> allSales = in.getSales();
        for(Sale aSale : allSales) {
            shipping.applyShipping(aSale);
        }
        out.generateReport(allSales);
    }
}

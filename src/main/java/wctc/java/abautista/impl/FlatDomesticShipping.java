package wctc.java.abautista.impl;

import wctc.java.abautista.Sale;
import wctc.java.abautista.iface.ShippingPolicy;

import java.util.Locale;

public class FlatDomesticShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        if (sale.getCountry().equalsIgnoreCase("united states") ||
            sale.getCountry().equalsIgnoreCase("usa") ||
            sale.getCountry().equalsIgnoreCase("us"))
        {
            sale.setShipping(5.99);
        } else {
            sale.setShipping(14.99);
        }
    }
}

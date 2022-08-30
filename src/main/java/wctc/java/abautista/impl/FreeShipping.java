package wctc.java.abautista.impl;

import wctc.java.abautista.Sale;
import wctc.java.abautista.iface.ShippingPolicy;

public class FreeShipping implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0.00);
    }
}

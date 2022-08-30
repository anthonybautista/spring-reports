package wctc.java.abautista;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import wctc.java.abautista.iface.SalesInput;
import wctc.java.abautista.iface.SalesReport;
import wctc.java.abautista.iface.ShippingPolicy;
import wctc.java.abautista.impl.*;

@Configuration
@ComponentScan("wctc.java.abautista")
public class AppConfig {
    @Bean
    public SalesReport salesReport() {
//        return new DetailReport();
        return new SummaryReport();
    }

    @Bean
    public SalesInput salesInput() {
//        return new ConsoleInput();
        return new FileInput();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
//        return new FreeShipping();
        return new FlatDomesticShipping();
    }

}
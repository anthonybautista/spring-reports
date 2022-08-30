package wctc.java.abautista.impl;

import wctc.java.abautista.Sale;
import wctc.java.abautista.iface.SalesInput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements SalesInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        boolean done = false;

        do {
            System.out.print("Enter sale as follows with commas OR 'done' (full name,country,sale amount,tax): \n");
            String response = scanner.nextLine();
            if (response.equals("done")) {
                done = true;
            } else {
                String[] sale = response.split(",", 4);
                Sale newSale = new Sale(sale[0],sale[1],Double.parseDouble(sale[2]),Double.parseDouble(sale[3]));
                sales.add(newSale);
            }
        } while (!done);

        return sales;
    }
}

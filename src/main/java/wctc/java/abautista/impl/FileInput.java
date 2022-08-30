package wctc.java.abautista.impl;

import wctc.java.abautista.Sale;
import wctc.java.abautista.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try {
            File myObj = new File("sales.txt");
            Scanner s = new Scanner(myObj);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                String[] sale = data.split(",", 4);
                Sale newSale = new Sale(sale[0],sale[1],Double.parseDouble(sale[2]),Double.parseDouble(sale[3]));
                sales.add(newSale);
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("No File Found!");
        }
        return sales;
    }
}

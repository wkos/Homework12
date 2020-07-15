package pl.wkos.homework121;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Product[] products = new Product[5];
        products[0] = new Product("kmputer", "Dell", 1250);
        products[1] = new Product("Mysz", "Gigabyte", 23);
        products[2] = new Product("Monitor", "Nec", 2134);
        products[3] = new Product("Smartfon", "Samsung", 2544);
        products[4] = new Product("Smarwatch", "Garmin", 2543);

        String fileName = "dane.csv";
        WriteData.writeToFile(products, fileName);

        Product[] readedProducts;
        readedProducts = ReadData.readFromFile(fileName);
        for (Product product : readedProducts) System.out.println(product.toString());
    }
}

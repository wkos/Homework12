package pl.wkos.homework121;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
    public static Product[] readFromFile(String fileName) {
        Product[] products = new Product[5];
        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            int counter = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields;
                fields = line.split(";");
                double price = Double.parseDouble(fields[2]);
                products[counter] = new Product(fields[0], fields[1], price);
                counter++;
            }
        } catch (IOException e) {
            System.out.println("błąd wejścia");
        }
        return products;
    }
}

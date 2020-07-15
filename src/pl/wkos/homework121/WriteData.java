package pl.wkos.homework121;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void writeToFile(Product[] products, String fileName) {
        try (
                var file = new FileWriter(fileName);
                var bufferedWriter = new BufferedWriter(file)
        ) {
            for (int i = 0; i < 5; i++) {
                String line = products[i].getName() + ";" + products[i].getManufacturer() + ";" +
                        String.format("%.2f", products[i].getPrice());
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("błąd wyjścia");
        }
    }
}

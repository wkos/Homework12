package pl.wkos.homework123;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    public static List<Employee> readDataFromFile(String fileName) {
        List<Employee> employees = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            int i = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields;
                fields = line.split(";");
                double salary = Double.parseDouble(fields[4]);
                Department department = new Department(fields[3]);
                Employee employee = new Employee(fields[0], fields[1], fields[2], department, salary);
                employees.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Błąd wejścia");
        }
        return employees;
    }
}

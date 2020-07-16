package pl.wkos.homework123;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees;
        String fileName = "employees.csv";
        employees = ReadData.readDataFromFile(fileName);


        WriteData.writeDataToScreen(employees);
        WriteData.writeDataToFile(employees, "danezpliku.csv");
    }
}

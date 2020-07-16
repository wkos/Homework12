package pl.wkos.homework123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteData {
    public static void writeDataToScreen(List<Employee> employees) {
        System.out.println("Departamenty");
        List<Department> departments;
        departments = EmployeeUtils.getDepartments(employees);
        for (Department department : departments) {
            System.out.println(department.toString());
        }
        System.out.println("-----------------------");

        System.out.println("Pracownicy");
        for (Employee item : employees)
            System.out.println(item.toString());
        System.out.println("-----------------------");

        System.out.println("Dane statystyczne");
        double avgSalary = EmployeeUtils.averageSalary(employees);
        System.out.println("Srednia wypłata: " + avgSalary);
        double minSalary = EmployeeUtils.minSalary(employees);
        System.out.println("Najmniejsza wypłata: " + minSalary);
        double maxSalary = EmployeeUtils.maxSalary(employees);
        System.out.println("Największa wypłata: " + maxSalary);
        int numberOfEmployees = EmployeeUtils.numberOfEmloyees(employees);
        System.out.println("Lączna liczba pracowników: " + numberOfEmployees);
        for (Department department : departments) {
            System.out.println("Liczba pracowników w dziale " + department.toString() + ": " +
                    EmployeeUtils.numberOfDepartmentEmployees(employees, department.getName()));
        }
    }

    public static void writeDataToFile(List<Employee> employees, String fileName) {
        try (
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            double averageSalary = EmployeeUtils.averageSalary(employees);
            bufferedWriter.write("Srednia wypłata: " + String.format("%.2f", averageSalary));
            bufferedWriter.newLine();
            double minSalary = EmployeeUtils.minSalary(employees);
            bufferedWriter.write("Najmniejsza wypłata: " + String.format("%.2f", minSalary));
            bufferedWriter.newLine();
            double maxSalary = EmployeeUtils.maxSalary(employees);
            bufferedWriter.write("Największa wypłata: " + String.format("%.2f", maxSalary));
            bufferedWriter.newLine();
            int numberOfEmployees = EmployeeUtils.numberOfEmloyees(employees);
            bufferedWriter.write("Lączna liczba pracowników: " + numberOfEmployees);
            bufferedWriter.newLine();
            List<Department> departments = EmployeeUtils.getDepartments(employees);
            for (Department department : departments) {
                bufferedWriter.write("Liczba pracowników w dziale " + department.toString() + ": " +
                        EmployeeUtils.numberOfDepartmentEmployees(employees, department.getName()));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("błąd wyjścia");
        }
    }
}

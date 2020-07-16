package pl.wkos.homework123;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
    public static double averageSalary(List<Employee> employees) {
        double sum = 0;
        for (Employee item : employees) {
            sum += item.getSalary();
        }
        return sum / employees.size();
    }

    public static double minSalary(List<Employee> employees) {
        double min = employees.get(0).getSalary();
        for (int i = 1; i < employees.size(); i++) {
            double salary = employees.get(i).getSalary();
            if (salary < min) min = salary;
        }
        return min;
    }

    public static double maxSalary(List<Employee> employees) {
        double max = employees.get(0).getSalary();
        for (int i = 1; i < employees.size(); i++) {
            double salary = employees.get(i).getSalary();
            if (salary > max) max = salary;
        }
        return max;
    }

    public static int numberOfEmloyees(List<Employee> employees) {
        return employees.size();
    }

    public static int numberOfDepartmentEmployees(List<Employee> employees, String department) {
        int counter = 0;
        for (Employee item : employees) {
            String nameOfDepartment = item.getDepartment().getName();
            if (nameOfDepartment.equals(department)) counter++;
        }
        return counter;
    }

    public static List<Department> getDepartments(List<Employee> employees) {
        List<Department> departments = new ArrayList<>();
        if (employees != null) departments.add(employees.get(0).getDepartment());
        else return null;
        for (Employee employee : employees) {
            boolean exist = false;
            String nameOfDepartment = employee.getDepartment().getName();
            for (Department department : departments) {
                if (nameOfDepartment.equals(department.getName())) {
                    exist = true;
                    break;
                }
            }
            if (!exist)
                departments.add(employee.getDepartment());
        }
        return departments;
    }
}

package pl.wkos.homework123;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private Department department;
    private double salary;

    public Employee(String firstName, String lastName, String pesel, Department department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", pesel " + pesel + ", dział " + department +
                ", wynagrodzenie " + String.format("%.2f", salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return pesel.equals(employee.pesel) &&
                department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel, department);
    }
}

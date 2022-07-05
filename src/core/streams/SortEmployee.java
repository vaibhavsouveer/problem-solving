package core.streams;

import commons.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getAllEmployees();
        System.out.println("Employees = " + employees);
        System.out.println("Sorted Employees = " + employees.stream()
                .sorted()
                .collect(Collectors.toList())
        );
    }
}

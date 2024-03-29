package core.streams;

import commons.Department;
import commons.Employee;
import commons.SortEmployeeBySalary;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        /*
        System.out.println("DepartmentWiseEmployees = " + departmentWiseEmployees());
        System.out.println("DepartmentWiseEmployeesCount = " + departmentWiseEmployeesCount());
        System.out.println("departmentWiseEmployeeNames = " + departmentWiseEmployeeNames());
        System.out.println("departmentWiseMaxSalary = " + departmentWiseMaxSalary());
        System.out.println("departmentWiseAverageSalary = " + departmentWiseAverageSalary());
        System.out.println("sortBasedOnSalary = " + sortBasedOnSalary());
        System.out.println("sortBasedOnSalaryWithPair = " + sortBasedOnSalaryWithPair());
        */

        //System.out.println("ans  = " + sortBasedOnSalaryWithPair());
        sortBySalary();


    }

    /*
        Sort employees by salary using Streams, not Collections.sort or List.sort.
     */
    public static void sortBySalary() {
        List<Employee> allEmployees = Employee.getAllEmployees();
        System.out.println("Employees sorted by salary : " +
                        allEmployees.stream()
                                // .sorted() this can be used if the type of stream elements is Comparable
                                .sorted(Comparator.comparingDouble(emp -> emp.salary))
                                .collect(Collectors.toList())
                );
    }

    /*
        List of employees (object) working in each department
     */
    public static Map<Department, List<Employee>> departmentWiseEmployees() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.departmentName));
                //.collect(Collectors.groupingBy(employee -> employee.departmentName, Collectors.toList()));
    }

    /*
        List of employee names working in each department
     */
    public static Map<Department, List<String>> departmentWiseEmployeeNames() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.departmentName,
                        Collectors.mapping(employee -> employee.name, Collectors.toList())));
    }

    /*
        Employee details in each department getting max salary
     */
    public static Map<Department, Optional<Employee>> departmentWiseMaxSalary() {
        return Employee.getAllEmployees().stream()
                //.collect(Collectors.groupingBy(employee -> employee.departmentName, Collectors.maxBy(new SortEmployeeBySalary())));
                .collect(Collectors.groupingBy(employee -> employee.departmentName,
                        Collectors.maxBy(Comparator.comparing(employee -> employee.salary))));
    }

    /*
        Average salary of employees working in each department
     */
    public static Map<Department, Double> departmentWiseAverageSalary() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.departmentName,
                        Collectors.averagingDouble(employee -> employee.salary)));
    }

    /*
        Count of employees working in each department
     */
    public static Map<Department, Long> departmentWiseEmployeesCount() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.departmentName, Collectors.counting()));
    }

    /*
        Sorted list of employee details based on salary
     */
    public static List<Employee> sortBasedOnSalary() {
        return Employee.getAllEmployees().stream()
                .sorted(Comparator.comparingDouble(employee -> employee.salary))
                .collect(Collectors.toList());
    }

    /*
        Sorted list of employee details based on salary
     */
    public static Map<String, List<Double>> sortBasedOnSalaryWithPair() {
        return Employee.getAllEmployees().stream()
                .sorted(Comparator.comparingDouble(employee -> employee.salary))
                .collect(Collectors.groupingBy(employee -> employee.name, Collectors.mapping(employee -> employee.salary, Collectors.toList())));
    }

    /*
        Get the name of highest paid female employee in each department
     */
    public static Map<String, Optional<Employee>> highestPaidFemaleEmployeeInEachDepartment() {
        return Employee.getAllEmployees().stream()
                .filter(employee -> employee.gender.equalsIgnoreCase("female"))
                .collect(Collectors.groupingBy(employee -> employee.name,
                        Collectors.maxBy(Comparator.comparing(employee -> employee.salary))));

    }


}

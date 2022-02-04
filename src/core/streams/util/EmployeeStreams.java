package core.streams.util;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        //System.out.println("DepartmentWiseEmployees = " + departmentWiseEmployees());
        //System.out.println("DepartmentWiseEmployeesCount = " + departmentWiseEmployeesCount());
        // System.out.println("statusWiseEmployees = " + statusWiseEmployees());
        System.out.println("sortBasedOnSalary = " + sortBasedOnSalary());

    }

    /*
        List of employee details working in each department
     */
    public static Map<Department, List<Employee>> departmentWiseEmployees() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.departmentName, Collectors.toList()));
    }

    /*
        Count of employees working in each department
     */
    public static Map<Department, Long> departmentWiseEmployeesCount() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.departmentName, Collectors.counting()));
    }

    /*
        List of employee details based on active status
     */
    public static Map<String, List<Employee>> statusWiseEmployees() {
        return Employee.getAllEmployees().stream()
                .collect(Collectors.groupingBy(employee -> employee.status, Collectors.toList()));
    }

    /*
        Sorted list of employee details based on salary
     */
    public static List<Employee> sortBasedOnSalary() {
        return Employee.getAllEmployees().stream()
                .sorted().toList();
    }
}

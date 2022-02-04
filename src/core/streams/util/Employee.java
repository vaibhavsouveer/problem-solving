package core.streams.util;

import java.util.Arrays;
import java.util.List;

public class Employee {
    int id;
    String name;
    String gender;
    Department departmentName;
    int departmentId;
    double salary;
    String status;


    public Employee(int id, String name, String gender, Department departmentName, int departmentId, double salary, String status) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.salary = salary;
        this.status = status;
    }

    public static List<Employee> getAllEmployees() {
        Employee employee1 = new Employee(1, "Adam", "male", Department.ACCOUNTS, 2, 34000, "active");
        Employee employee2 = new Employee(2, "Jenny","female", Department.FINANCE, 1, 61000, "active");
        Employee employee3 = new Employee(3, "Emily","female", Department.FINANCE, 1, 45000, "inactive");
        Employee employee4 = new Employee(4, "Dave","male", Department.ADVERTISING, 3, 35000, "active");
        Employee employee5 = new Employee(5, "Sophia","female", Department.ACCOUNTS, 2, 50500, "active");
        Employee employee6 = new Employee(6, "James","male", Department.ADVERTISING, 3, 16000, "inactive");
        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6);
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", departmentName=" + departmentName +
                ", departmentId=" + departmentId +
                ", status='" + status + '\'' +
                '}';
    }
}

enum Department {
    PRODUCT, FINANCE, ACCOUNTS, ADVERTISING, SALES
}

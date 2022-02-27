package core.streams.employee;

import java.util.Arrays;
import java.util.List;

public class Employee {
    String name;
    String gender;
    Department departmentName;
    Double salary;


    public Employee(String name, String gender, Department departmentName, double salary) {
        this.name = name;
        this.gender = gender;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public static List<Employee> getAllEmployees() {
        Employee employee1 = new Employee("Adam", "male", Department.ACCOUNTS, 34000);
        Employee employee2 = new Employee("Jenny","female", Department.FINANCE,61000);
        Employee employee3 = new Employee("Emily","female", Department.FINANCE, 45000);
        Employee employee4 = new Employee( "Mike","male", Department.SALES,35000);
        Employee employee5 = new Employee( "Sophia","female", Department.ACCOUNTS,50500);
        Employee employee6 = new Employee( "Jack","male", Department.ADVERTISING,16000);
        Employee employee7 = new Employee( "Derek", "male", Department.ADVERTISING,34000);
        Employee employee8 = new Employee( "Rose","female", Department.FINANCE,61000);
        Employee employee9 = new Employee( "Kate","female", Department.FINANCE,45000);
        Employee employee10 = new Employee( "Reed","male", Department.ADVERTISING,35000);
        Employee employee11 = new Employee( "Sasha","female", Department.ACCOUNTS,50500);
        Employee employee12 = new Employee( "Kirk","male", Department.PRODUCT,16000);

        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6, employee7,
                employee8, employee9, employee10, employee11, employee12);
        return employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", departmentName=" + departmentName +
                ", salary=" + salary +
                '}';
    }
}

enum Department {
    PRODUCT, FINANCE, ACCOUNTS, ADVERTISING, SALES
}

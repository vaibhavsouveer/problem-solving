package core.streams.employee;

import java.util.Comparator;

public class SortEmployeeBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.salary == e2.salary) return 0;
        if(e1.salary > e2.salary) return 1;
        return -1;
    }
}

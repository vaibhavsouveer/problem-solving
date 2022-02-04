package test2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
sort(list,"id")
sort(list,"name")
sort(list,"lastname")
 */
public class Employee {
    int empId;
    String firstName;
    String lastName;

    List<Employee> list = new ArrayList<>();
    // add employees to list

    // call sort(list, "firstName")


    void sort(List list, String sortBasedOn) {
        Collections.sort(list, getComparator(sortBasedOn));
    }

    Comparator getComparator(String sortBasedOn) {
        if(sortBasedOn.equals("id")) {
            return null;
        } else if(sortBasedOn.equals("firstName")) {
            return null;
        } else {
            return null;
        }
    }
}

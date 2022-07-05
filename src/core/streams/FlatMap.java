package core.streams;

import commons.Employee;
import commons.util.array.ArrayUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        //List<int[]> list = Arrays.asList(ArrayUtil.getIntArray(), ArrayUtil.getIntArray(), ArrayUtil.getIntArray());

        useFlatMap(Arrays.asList(Employee.getAllEmployees(), Employee.getAllEmployees(), Employee.getAllEmployees()));
    }

    private static void useFlatMap(List<List<Employee>> list) {
        System.out.println("After combining : " +
                list.stream()
                        .flatMap(empList -> empList.stream())
                        .map(emp -> emp.name)
                        .distinct()
                        .collect(Collectors.toList())
        );
    }

    /*private static void useFlatMap() {
        System.out.println("after combining : " +
                list.stream()
                .flatMap(intArr -> Arrays.stream(intArr))
                "");
    }*/
}

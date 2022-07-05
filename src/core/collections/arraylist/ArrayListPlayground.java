package core.collections.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPlayground {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        int a = 5;
        int b = 2;
        Double val = (double)a/b;
        System.out.println("val = " + val);
    }
}

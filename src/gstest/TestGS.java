package gstest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestGS {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Integer, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(num -> num % 2));
        //System.out.println("collect.toString() = " + collect.toString());


        /*String input = "Java is a good programming language";
        Stream.of(input)*/


        /*List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(
                myList.stream()
                        .filter(num -> num / 10 == 1)
                .collect(Collectors.toList())
        );*/

    }
}

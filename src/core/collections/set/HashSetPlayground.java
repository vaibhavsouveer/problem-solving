package core.collections.set;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetPlayground {
    public static void main(String[] args) {
        Set<Integer> set = Arrays.asList(1, 2, 3, 4, 5).stream().collect(Collectors.toSet());
        System.out.println("set.contains(3) = " + set.contains(3));
    }
}

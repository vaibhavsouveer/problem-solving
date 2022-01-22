package core.optional;

import java.util.Optional;

public class OptionalPlayground {
    public static void main(String[] args) {
        Integer roll = null;
        Optional<Integer> rank = Optional.ofNullable(roll);
        System.out.println("rank = " + rank.isPresent());
    }
}

package revision;

import java.util.Arrays;
import java.util.stream.Stream;

public class Random {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, -4, -5, 9, 0, -9};
        System.out.println(getMax(input));
    }

    public static int getMax(int[] input) {
        return Arrays.stream(input)
                .max()
                .getAsInt();
    }
}

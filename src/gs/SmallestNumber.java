package gs;

import java.util.stream.IntStream;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("FindMin() = " + findMin(new int[]{3, 4, 5, 6, 1, 2}));

    }

    public static int findMin(int a[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int findMinBinary(int a[]) {
        return 0;
    }

    public static int findMinStream(int a[]) {
        return IntStream.of(a).min().getAsInt();
    }

}

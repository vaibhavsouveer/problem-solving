package commons.util.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayUtil {

    public static int[] getIntArray() {
        return new int[]{4, 76, 44, 91, 111, 8, 45};
    }

    public static int getMaxElementInArray(int[][] arr, int m, int n) {
        OptionalInt max = Arrays.stream(arr)
                .flatMapToInt(a -> Arrays.stream(a))
                .max();
        return max.getAsInt();
    }

    /*
    2 d int array
     */
    public static void printArray(int[][] arr, int m, int n) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*

     */
    public static void printArray(boolean[][] arr, int m, int n) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

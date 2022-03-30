package sorting.insertion;

import commons.array.ArrayUtil;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = new int[] {5, 9, 3, 8, 1};
        fun(input);
        ArrayUtil.printArray(input);
    }

    private static void fun(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int t = i;
            for (int j =  i- 1; j >= 0 && arr[t] < arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[t];
                arr[t] = temp;
                t--;
            }
            System.out.print("arr after " + i + "th pass -> ");
            ArrayUtil.printArray(arr);
        }
    }
}

package sorting.insertion;

import commons.array.ArrayUtil;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] input = new int[] {5, 9, 3, 1001, 8, 1, 66, 4, 55};
        fun(input, input.length);
        ArrayUtil.printArray(input);
    }

    private static void fun(int[] arr, int n) {
        if(n == 1) {
            return;
        }
        // 0 to n-2 position is sorted, add a[n-1] in the correct position
        fun(arr, n-1);
        int i = n-1;
        while(i - 1 >= 0 && arr[i] < arr[i-1]) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }

    }
}

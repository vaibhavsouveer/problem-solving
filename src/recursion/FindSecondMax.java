package recursion;

import java.util.Arrays;

/*
Find second max element from a list of numbers
List will have at least two numbers
*/
public class FindSecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] res = fun(arr, arr.length);

        System.out.println("second max is = " + res[0]);
        System.out.println("max is = " + res[1]);
    }

    // second max at 0 index of array, max at 1
    static int[] fun(int[] arr, int n) {
        if (n == 2) {
            return arr[0] > arr[1] ? new int[]{arr[1], arr[0]} : new int[]{arr[0], arr[1]};
        }
        int[] res = fun(arr, n - 1);
        if(arr[n-1] > res[1]) {
            res[0] = res[1];
            res[1] = arr[n-1];
        } else if (arr[n-1] < res[1] && arr[n-1] > res[0]) {
            res[0] = arr[n-1];
        }
        return res;

    }
}

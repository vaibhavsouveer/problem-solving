package dsa.recursion.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Find the first and last occurrence of an element in a sorted array
 */
public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 4, 5, 5, 5, 7, 7, 7, 7, 8, 11, 11, 22, 32};
        int target = 321;
        System.out.println("First index = " + fun(arr, 0, arr.length-1, target, -1));
    }

    private static List<Integer> fun(int[] arr, int s, int e, int t, int res) {
        if(arr.length == 0) {
            return new ArrayList<>(Arrays.asList(-1));
        }
        if(s > e) {
            return new ArrayList<>(Arrays.asList(res));
        }
        int mid = s + (e - s) / 2;
        if(arr[mid] == t) {
            res = mid;
            e = mid - 1;
        } else if(t > arr[mid]) {
            s = mid+1;
        } else {
            e = mid-1;
        }
        res = fun(arr, s, e, t, res).get(0);
        return new ArrayList<>(Arrays.asList(res));
    }
}

package dsa.algo.recursion;

import java.util.ArrayList;

/*
Recursive method to get all the indexes of an array containing a given number
 */
public class IndexOfNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 3, 5, 31, 3, 4, 3, 12, 3, 17, 3};
        int target = 3;
        System.out.println("Index = " + fun(arr, arr.length, target));
    }

    static ArrayList<Integer> fun(int[] arr, int n, int t) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(n == 0) {
            return ans;
        }

        ArrayList<Integer> tempList = fun(arr, n - 1, t);
        if(!tempList.isEmpty()) {
            ans.addAll(tempList);
        }
        if(arr[n-1] == t) {
            ans.add(n-1);
        }
        return ans;
    }
}

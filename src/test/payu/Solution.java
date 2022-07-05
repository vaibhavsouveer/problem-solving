package test.payu;

import java.util.ArrayList;

class Solution {
    static ArrayList<String> subSets = new ArrayList<>();
    static int target = 4;
    public static void main(String[] args) {

        int[] arr = {2,7,1,6,1};
        getSubsets(arr, arr.length, target, "", 0);
        System.out.println(subSets);
    }

    public static void getSubsets(int[] arr, int n, int S, String subset, int subsetSum) {
        if (n == 0) {
            if (subsetSum == target) {
                subSets.add(subset);
            }
            return;
        }
        if (subsetSum == target) {
            subSets.add(subset);
            return;
        }
        if (arr[n - 1] > S) {
            getSubsets(arr, n - 1, S, subset, subsetSum);
        } else {
            getSubsets(arr, n - 1, S - arr[n - 1], subset + arr[n - 1], subsetSum + arr[n - 1]);
            getSubsets(arr, n - 1, S, subset, subsetSum);
        }

    }
}
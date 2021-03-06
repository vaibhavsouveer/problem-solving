package dsa.algo.dp.adityaverma.knapsack.subsetsumcount.bottomup;

import commons.util.array.ArrayUtil;

public class SubsetSumCountBottomUp {
    public static void main(String[] args) {
        System.out.println("SubsetSumBottomUp");
        /*int[] arr = {1, 4, 6, 11, 14, 3};
        int S = 7;*/
        int[] arr =  new int[] {4, 9, 5, 6, 1, 2, 13, 3};
        int S = 6;

        int count = subsetSumCount(arr, arr.length, S);
        System.out.println("count of subset present = " + count);
    }

    public static int subsetSumCount(int[] arr, int n, int S) {
        int[][] t = new int[n+1][S+1];
        for(int i = 0; i <= S; i++) {
            t[0][i] = 0;
        }
        for(int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(arr[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
            }
        }
        ArrayUtil.printArray(t, n, S);
        return t[n][S];
    }
}

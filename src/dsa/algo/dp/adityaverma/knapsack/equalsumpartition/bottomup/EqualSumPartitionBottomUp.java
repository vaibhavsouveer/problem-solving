package dsa.algo.dp.adityaverma.knapsack.equalsumpartition.bottomup;

import java.util.stream.IntStream;

public class EqualSumPartitionBottomUp {

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5, 6, 4};
        int sum = IntStream.of(arr).sum();
        System.out.println("sum = " + sum);
        System.out.println("Is equal sum partition possible = " + equalSumPartition(arr, arr.length, sum));

    }

    public static boolean equalSumPartition(int[] arr, int n, int S) {
        if(S%2 != 0) {
            return false;
        }
        S = S/2;
        boolean[][] t = new boolean[n+1][S+1];
        for(int i = 0; i <= S; i++) {
            t[0][i] = false;
        }
        for(int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(arr[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
            }
        }
        return t[n][S];
    }

}

package dp.knapsack.minimumsubsetsumdifference.bottomup;

import java.util.stream.IntStream;

public class MinSubSetSumDiffBottomUp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4};
        int sum = IntStream.of(arr).sum();
        System.out.println("sum = " + sum);
        int minDiff = minSubSetSumDiff(arr, arr.length, sum);
        System.out.println("minDiff = " + minDiff);
    }

    public static int minSubSetSumDiff(int[] arr, int n, int S) {
        boolean[][] t = new boolean[n+1][S+1];
        for(int i = 0; i <= S; i++) {
            t[0][i] = false;
        }
        for(int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        // run logic to populate the t matrix
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= S; j++) {
                if(arr[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
            }
        }

        // evaluate the last row of t matrix till half elements
        int minSumDiff = Integer.MAX_VALUE;
        for(int j = 0; j <= S/2; j++) {
            if(t[n][j]) {
                if(S-2*j < minSumDiff) {
                    minSumDiff = S-2*j;
                }
            }
        }
        return minSumDiff;
    }
}

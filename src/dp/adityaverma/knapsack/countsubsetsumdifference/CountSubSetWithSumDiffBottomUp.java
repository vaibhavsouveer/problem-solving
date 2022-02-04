package dp.adityaverma.knapsack.countsubsetsumdifference;

import java.util.stream.IntStream;

public class CountSubSetWithSumDiffBottomUp {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;
        int sum = IntStream.of(arr).sum();
        System.out.println("sum = " + sum);
        int count = countSubSetSumDiff(arr, arr.length, sum, diff);
        System.out.println("count = " + count);
    }

    public static int countSubSetSumDiff(int[] arr, int n, int sum, int diff) {
        if(sum == diff) {
            return 1;
        }
        if((sum - diff) % 2 != 0) {
            return 0;
        }
        int s1 = (sum - diff)/2;
        int[][] t = new int[n+1][s1+1];
        for(int i = 0; i <= s1; i++) {
            t[0][i] = 0;
        }
        for(int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        // run logic to populate the t matrix
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= s1; j++) {
                if(arr[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
            }
        }
        return t[n][s1];
    }
}

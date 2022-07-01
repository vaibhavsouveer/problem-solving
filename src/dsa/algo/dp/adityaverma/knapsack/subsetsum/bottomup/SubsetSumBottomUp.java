package dsa.algo.dp.adityaverma.knapsack.subsetsum.bottomup;

public class SubsetSumBottomUp {
    public static void main(String[] args) {
        System.out.println("SubsetSumBottomUp");
        int[] arr = {1, 4, 6, 11, 14, 3};
        int S = 7;

        boolean isSubsetPresent = subsetSum(arr, arr.length, S);
        System.out.println("isSubsetPresent = " + isSubsetPresent);
    }

    public static boolean subsetSum(int[] arr, int n, int S) {
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
        printArray(t, n, S);
        return t[n][S];
    }

    private static void printArray(boolean[][] t, int r, int c) {
        for(int i = 0; i <= r; i++) {
            for(int j = 0; j <= c; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}

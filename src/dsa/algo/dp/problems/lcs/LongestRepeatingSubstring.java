package dsa.algo.dp.problems.lcs;

/*
Find the length of longest substring with non repeating characters
 */
public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        String a = "bcdbc";
        System.out.println("Length of longest substring = " + fun(a, a, a.length(), a.length()));
    }

    // longest repeating sub string
    private static int fun(String a, String b, int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        int[][] t = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            t[i][0] = 0;
        }
        for(int i = 0; i <= n; i++) {
            t[0][i] = 0;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(a.charAt(i-1) == b.charAt(j-1) && i != j) {
                    t[i][j] = 1 + t[i-1][j-1];
                } else {
                    t[i][j] = 0;
                    //t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }
}

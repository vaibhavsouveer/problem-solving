package dsa.dp.adityaverma.lcs.printlongestcommonsubsequence;

public class PrintLCSBottomUp {
    public static void main(String[] args) {
        String x = "abcdghr";
        String y = "abcdhrg";
        String lcs = fun(x, y, x.length(), y.length());
        System.out.println("Length of LCS = " + lcs.length());
        System.out.println("Longest Common Subsequence = " + lcs);


    }

    /*
        Returns a String that is longest common subsequence.
     */
    public static String fun(String x, String y, int m, int n) {
        if(m == 0 || n == 0) {
            return "";
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
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        StringBuilder output = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                output.append(x.charAt(i - 1));
                i--;
                j--;
            } else {
                if (t[i][j - 1] > t[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }
        return output.reverse().toString();

    }
}

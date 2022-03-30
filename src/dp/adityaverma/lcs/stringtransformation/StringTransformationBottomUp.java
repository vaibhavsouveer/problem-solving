package dp.adityaverma.lcs.stringtransformation;


/*
    Find out the minimum number of insertions and deletions required to transform a given String to another String.
 */
public class StringTransformationBottomUp {
    public static void main(String[] args) {
        String x = "vaibhav";
        String y = "souveer";
        int lcsLength = findLCS(x, y, x.length(), y.length());
        findMinimumNumberOfOperations(x, y, lcsLength);


    }

    public static void findMinimumNumberOfOperations(String x, String y, int lcsLength) {
        System.out.println("Insertions = " + (y.length() - lcsLength));
        System.out.println("Deletions = " + (x.length() - lcsLength));
    }

    public static int findLCS(String x, String y, int m, int n) {
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
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];

    }
}

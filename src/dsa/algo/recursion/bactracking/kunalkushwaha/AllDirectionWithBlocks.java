package dsa.algo.recursion.bactracking.kunalkushwaha;

/*
Count all possible paths from (0,0) to (n,n)
 */
public class AllDirectionWithBlocks {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[][]{
                new boolean[]{true, true, true},
                new boolean[]{true, true, true},
                new boolean[]{true, true, true}};

        System.out.println("Possible ways = " + fun(arr, arr.length, arr[0].length, 0, 0));
    }

    /*
    movements in all four directions are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
     */
    private static int fun(boolean[][] arr, int m, int n, int i, int j) {
        if (!arr[i][j]) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        arr[i][j] = false;
        int count = 0;
        if (i == m - 1) {
            count = count + fun(arr, m, n, i, j + 1);
            count = count + fun(arr, m, n, i - 1, j);
            if (j != 0) {
                count = count + fun(arr, m, n, i, j - 1);
            }
        } else if (j == n - 1) {
            count = count + fun(arr, m, n, i + 1, j);
            count = count + fun(arr, m, n, i, j - 1);
            if (i != 0) {
                count = count + fun(arr, m, n, i - 1, j);
            }
        } else {
            count = count + fun(arr, m, n, i, j + 1);
            count = count + fun(arr, m, n, i + 1, j);
            if (i != 0) {
                count = count + fun(arr, m, n, i - 1, j);
            }
            if (j != 0) {
                count = count + fun(arr, m, n, i, j - 1);
            }
        }
        arr[i][j] = true;
        return count;
    }
}

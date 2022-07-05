package dsa.algo.recursion.bactracking.kunalkushwaha;

/*
Find all possible paths from (0,0) to (n,n)
 */
public class ShortestPathInMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 4, 2}, {3, 1, 2}};
        //int[][] arr = {{1, 4, 5}, {3, 1, 6}, {1, 5, 2}};
        System.out.println("Length of shortest path = " + fun(arr, arr.length, arr[0].length, 0, 0));
    }

    /*
    movements in all four directions are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
    print path matrix for the shortest path
     */
    private static int fun(int[][] arr, int m, int n, int i, int j) {
        if(arr[i][j] < 0) {
            return Integer.MAX_VALUE;
        }
        if(i == m-1 && j == n-1) {
            return arr[i][j];
        }
        arr[i][j] = -arr[i][j];
        int minSubPath;
        if(i == m-1) {
            minSubPath = Math.min(fun(arr, m, n, i, j+1), fun(arr, m, n, i-1, j));
            if(j != 0) {
                minSubPath = Math.min(minSubPath, fun(arr, m, n, i, j-1));
            }
        } else if(j == n-1) {
            minSubPath = Math.min(fun(arr, m, n, i+1, j), fun(arr, m, n, i, j-1));
            if(i != 0) {
                minSubPath = Math.min(minSubPath, fun(arr, m, n, i-1, j));
            }
        } else {
            minSubPath = Math.min(fun(arr, m, n, i, j+1), fun(arr, m, n, i+1, j));
            if(j != 0) {
                minSubPath = Math.min(minSubPath, fun(arr, m, n, i, j-1));

            }
            if(i != 0) {
                minSubPath = Math.min(minSubPath, fun(arr, m, n, i-1, j));

            }
        }
        arr[i][j] = -arr[i][j];
        return minSubPath == Integer.MAX_VALUE ? minSubPath : arr[i][j] + minSubPath;
    }

}

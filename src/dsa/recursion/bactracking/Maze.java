package dsa.recursion.bactracking;

/*
Count all possible paths from (0,0) to (n,n)
 */
public class Maze {
    public static void main(String[] args) {
        System.out.println("Possible ways = " + fun(3, 3, 0, 0));
    }

    /*
    only right and down movements are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
     */
    private static int fun(int m, int n, int i, int j) {
        if(i == m-1 && j == n-1) {
            return 1;
        }
        int count = 0;

        if(i == m-1) {
            count = count + fun(m, n, i, j+1);
        } else if(j == n-1) {
            count = count + fun(m, n, i+1, j);
        } else {
            count = count + fun(m, n, i+1, j);
            count = count + fun(m, n, i, j+1);
            // below call if diagonal is allowed
            // count = count + fun(m, n, i+1, j+1);
        }
        return count;

    }
}

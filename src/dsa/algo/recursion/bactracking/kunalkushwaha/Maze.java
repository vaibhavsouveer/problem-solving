package dsa.algo.recursion.bactracking.kunalkushwaha;

/*
Count all possible paths from (0,0) to (n,n)
 */
public class Maze {
    public static void main(String[] args) {
        System.out.println("Count of possible paths = " + fun(3, 3, 0, 0));
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

    private static int funShort(int m, int n, int i, int j) {
        // changing this from && to || takes care of last row or last column condition
        // when we are at last column or last row there is only one possible path
        // unless there is a block in between in which case this will not work
        if(i == m-1 || j == n-1) {
            return 1;
        }
        int count = 0;
        {
            count = count +  fun(m, n, i+1, j);
            count = count + fun(m, n, i, j+1);
            // below call if diagonal is allowed
            // count = count + fun(m, n, i+1, j+1);
        }
        return count;

    }
}

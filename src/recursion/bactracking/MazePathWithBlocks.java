package recursion.bactracking;

/*
Find all possible paths from (0,0) to (n,n)
 */
public class MazePathWithBlocks {
    public static void main(String[] args) {
        System.out.println("Possible ways = " + fun(3, 3, 0, 0));
    }

    /*
    only right and down movements are allowed
    diagonal is not allowed
    m is number of rows and n is number of columns
     */
    private static int fun(int m, int n, int i, int j) {
        return 0;
    }
}

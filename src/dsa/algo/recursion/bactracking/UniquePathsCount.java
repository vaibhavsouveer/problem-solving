package dsa.algo.recursion.bactracking;

public class UniquePathsCount {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };
        /*int[][] grid = {
                {1, 0, },
                {2, 0}
        };*/
        int countOfNonBlockingTiles = 0;
        int startRowIndex = 0;
        int startColumnIndex = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    countOfNonBlockingTiles++;
                }
                if (grid[i][j] == 1) {
                    startRowIndex = i;
                    startColumnIndex = j;
                }
            }
        }

        int paths = paths(grid, grid.length, grid[0].length, startRowIndex, startColumnIndex, 1, countOfNonBlockingTiles + 2);
        System.out.println("paths = " + paths);
    }

    public static int paths(int[][] grid, int rows, int columns, int i, int j, int currLength, int expLength) {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("currLength = " + currLength);
        System.out.println("expLength = " + expLength);
        System.out.println();

        if (i == -1 || i == rows || j == -1 || j == columns) {
            return 0;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        if (grid[i][j] == 2) {
            if (currLength == expLength) {
                return 1;
            } else {
                return 0;
            }
        }
        if(grid[i][j] == 1 && currLength != 1) {
            return 0;
        }

        if (grid[i][j] == 0) {
            grid[i][j] = -1;
        }
        int count = paths(grid, rows, columns, i + 1, j, currLength + 1, expLength) +
                paths(grid, rows, columns, i, j + 1, currLength + 1, expLength) +
                paths(grid, rows, columns, i - 1, j, currLength + 1, expLength) +
                paths(grid, rows, columns, i, j - 1, currLength + 1, expLength);
        grid[i][j] = 0;
        return count;
    }

}

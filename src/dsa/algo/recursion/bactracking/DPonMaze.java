package dsa.algo.recursion.bactracking;

public class DPonMaze {
    public static int[][] result;
    public static void main(String[] args) {
        int[][] maze = new int[][] {
                {0, -1, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        result = new int[maze.length][maze[0].length];
        System.out.println("DP Count = " + fun(maze, maze.length, maze[0].length, 0, 0));
    }

    private static int fun(int[][] maze, int r, int c, int i, int j) {
        if(i == r || j == c) {
            return 0;
        }
        if(maze[i][j] == -1) {
            result[i][j] = 0;
            return 0;
        }
        if(i == r-1 && j == c-1) {
            result[i][j] = 1;
            return 1;
        }

        if(i == r-1) {
            if(result[i][j+1] == 0) {
                result[i][j+1] = fun(maze, r, c, i, j+1);
            }
            result[i][j] = result[i][j+1];
        } else if(j == c-1) {
            if(result[i+1][j] == 0) {
                result[i+1][j] = fun(maze, r, c, i+1, j);
            }
            result[i][j] = result[i+1][j];
        } else {
            if(result[i][j+1] == 0) {
                result[i][j+1] = fun(maze, r, c, i, j+1);
            }
            if(result[i+1][j] == 0) {
                result[i+1][j] = fun(maze, r, c, i+1, j);
            }
            result[i][j] = result[i][j+1] + result[i+1][j];
        }
        return result[i][j];
    }
}

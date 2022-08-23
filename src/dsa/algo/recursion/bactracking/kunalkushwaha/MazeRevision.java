package dsa.algo.recursion.bactracking.kunalkushwaha;

public class MazeRevision {
    public static void main(String[] args) {
        int[][] maze = new int[][] {
                {0, -1, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        System.out.println("Count = " + fun(maze, 0, 0));
    }

    private static int fun(int[][] maze, int i, int j) {

        if(i == -1 || j == -1 || i == maze.length || j == maze[0].length) {
            return 0;
        }
        if(maze[i][j] == -1) {
            return 0;
        }
        if(i == maze.length -1 && j == maze[0].length -1) {
            return 1;
        }

        maze[i][j] = -1;
        int count = fun(maze, i, j+1) +
                //fun(maze, i, j-1) +
                fun(maze, i+1, j) ;
                //fun(maze, i-1, j);
        maze[i][j] = 0;
        return count;
    }
}

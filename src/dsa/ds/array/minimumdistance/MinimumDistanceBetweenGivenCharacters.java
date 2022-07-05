package dsa.ds.array.minimumdistance;

public class MinimumDistanceBetweenGivenCharacters {
    public static void main(String[] args) {
        char[] input = {'a', 'i', 'b', 'c', 't', 'w', 'f', 'a', 'i', 'a', 'b', 'f'};
        System.out.println("Minimum distance = " + minimumDistance(input, 'a', 't', true, true));
    }

    // not completely correct
    private static int minimumDistance(char[] input, char first, char second, boolean moveFirst, boolean moveSecond) {
        int i = 0;
        int j = 0;
        int minDistance = Integer.MAX_VALUE;
        for(; i < input.length && j < input.length;) {
            if(moveFirst) {
                while(i < input.length && input[i] != first) {
                    i++;
                }
            }
            if (moveSecond) {
                while(j < input.length && input[j] != second) {
                    j++;
                }
            }
            if(i == input.length-1 || j == input.length-1) {
                return minDistance;
            }
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            minDistance = Math.min(getDistance(i, j), minDistance);
            if(i < j) {
                moveFirst = true;
                i++;
                moveSecond = false;
            } else {
                moveFirst = false;
                moveSecond = true;
                j++;
            }
            System.out.println();
        }
        return minDistance;
    }

    private static int getDistance(int i, int j) {
        int distance = Math.abs(j - i) + -1;
        System.out.println("distance = " + distance);
        return distance;
    }
}

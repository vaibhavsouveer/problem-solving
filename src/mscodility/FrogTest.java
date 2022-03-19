package mscodility;

public class FrogTest {
    public static void main(String[] args) {
        System.out.println("solution() = " + solution(new int[] {1, 1}));

    }

    public static int solution(int[] blocks) {
        int maxDistance = 0;
        for(int i = 0; i < blocks.length; i++) {
            int leftFrog = i, rightFrog = i;
            while(leftFrog > 0 && blocks[leftFrog] <= blocks[leftFrog - 1]) {
                leftFrog--;
            }
            while(rightFrog < blocks.length-1 && blocks[rightFrog] <= blocks[rightFrog + 1]) {
                rightFrog++;
            }
            int distanceBetweenFrogs = rightFrog - leftFrog + 1;
            if(distanceBetweenFrogs > maxDistance) {
                maxDistance = distanceBetweenFrogs;
            }
        }
        return maxDistance;
    }

}

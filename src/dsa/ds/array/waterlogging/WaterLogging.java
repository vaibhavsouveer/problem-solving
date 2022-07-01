package dsa.ds.array.waterlogging;

import commons.util.array.ArrayUtil;

/*
If you draw a bar graph you will notice that at any index i water stored will be Min(leftMax, righMax) - arr[i]
 */
public class WaterLogging {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 2, 6, 3, 5, 6};
        System.out.println("Amount of water stored = "+  waterLogging(arr));
    }

    private static int waterLogging(int[] arr) {
        if(arr.length < 3) {
            return 0;
        }
        int[] leftMaxArray = getLeftMaxArray(arr);
        int[] rightMaxArray = getRightMaxArray(arr);

        int water = 0;
        for(int i = 1; i < arr.length-1; i++) {
            int w = Math.min(leftMaxArray[i], rightMaxArray[i]) - arr[i];
            if(w > 0) {
                water = water + w;
            }
        }
        return water;
    }

    /*
    Find left max for all the elements except first and last as they wont store any water in any case
     */
    private static int[] getLeftMaxArray(int[] arr) {
        int[] leftMax = new int[arr.length];
        leftMax[0] = -1;
        for(int i = 1; i < arr.length-1; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
        }
        leftMax[arr.length-1] = -1;
        ArrayUtil.printArray(leftMax);
        return leftMax;
    }

    /*
    Find right max for all the elements except first and last as they wont store any water in any case
     */
    private static int[] getRightMaxArray(int[] arr) {
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] = -1;
        for(int i = arr.length-2; i > 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i+1]);
        }
        rightMax[0] = -1;
        ArrayUtil.printArray(rightMax);
        return rightMax;
    }
}

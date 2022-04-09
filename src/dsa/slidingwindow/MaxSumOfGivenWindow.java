package dsa.slidingwindow;

public class MaxSumOfGivenWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, -1, 0, 3, 4};
        int k = 3;
        int sum = 0;
        int j;
        for(j = 0; j < k; j++) {
            sum = sum + arr[j];
        }
        int maxSum = sum;
        int i = 0;
        while(j < arr.length) {
            sum = sum - arr[i] + arr[j];
            if(sum > maxSum) {
                maxSum = sum;
            }
            i++;
            j++;
        }
        System.out.println("maxSum = " + maxSum);
    }
}

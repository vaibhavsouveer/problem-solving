package dsa.algo.slidingwindow;

public class MaxSumOfGivenWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 2, -1, 1, 3, 4, 1, 8};
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

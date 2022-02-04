package dp.adityaverma.knapsack.subsetsum.recursive;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 11, 14, 1, 1};
        int S = 10;

        boolean isSubsetPresent = subsetSum(arr, arr.length, S);
        System.out.println("isSubsetPresent = " + isSubsetPresent);
    }

    public static boolean subsetSum(int[] arr, int n, int S) {
        if(n == 0) {
            return S == 0;
        } else {
            if(S == 0)
                return true;
        }


        if (arr[n - 1] > S) {
            return subsetSum(arr,n - 1, S);
        }
        return subsetSum(arr, n - 1, S - arr[n - 1]) || subsetSum(arr, n - 1, S);
    }
}

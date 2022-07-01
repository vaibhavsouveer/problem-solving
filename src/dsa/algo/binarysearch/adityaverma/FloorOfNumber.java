package dsa.algo.binarysearch.adityaverma;

/*
If number is present, return that number else return next smaller number
 */
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 22, 23, 24, 26, 28, 29};
        int target = 2;
        System.out.println("floor = " + fun(arr, 0, arr.length-1, target, -1));
    }

    private static int fun(int[] arr, int s, int e, int t, int res) {
        if(s > e) {
            return res;
        }
        int mid = s + (e-s)/2;
        // comment below == check if we want to return next smaller number even if
        // given number is present
        /*if(arr[mid] == t) {
            return arr[mid];
        }*/
        if(t > arr[mid]) {
            res = arr[mid];
            s = mid+1;
        } else {
            e = mid-1;
        }
        return fun(arr, s, e, t, res);
    }
}

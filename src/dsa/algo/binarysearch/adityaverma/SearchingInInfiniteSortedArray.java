package dsa.algo.binarysearch.adityaverma;

public class SearchingInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr =  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 15, 17, 19, 24, 25, 27, 29, 35, 37, 40};
        int target = 8;
        System.out.println("Index = " + fun(arr, target));
    }

    private static int fun(int[] arr, int t) {
        int s = 0;
        int e = 1;
        while(arr[e] <= t) {
            if(arr[e] == t) {
                return e;
            }
            s = e;
            e = 2 * e;
        }
        System.out.println("s = " + s);
        System.out.println("e = " + e);
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == t) {
                return mid;
            }
            if(t > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}

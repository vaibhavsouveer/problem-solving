package dsa.algo.binarysearch.kunalkushwaha;

public class PeakElementInBitonicArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println("Peak element = " + fun(arr, 0, arr.length));
    }

    private static int fun(int[] arr, int s, int e) {
        int mid = s + (e-s)/2;
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
            return arr[mid];
        }
        if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
            s = mid + 1;
        }
        if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) {
            e = mid - 1;
        }
        return fun(arr, s, e);
    }
}

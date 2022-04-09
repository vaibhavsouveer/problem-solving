package dsa.recursion;

/*
Find third max element from a list of numbers
List will have at least three numbers
*/
public class FindThirdMax {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 6, 1, 5, 3};
        int[] res = fun(arr, arr.length);

        System.out.println("third max is = " + res[0]);
        System.out.println("second max is = " + res[1]);
        System.out.println("max is = " + res[2]);
    }

    // third max at 0 index of array, max at 2
    static int[] fun(int[] arr, int n) {
        int[] res = new int[3];
        // this lengthy logic is just to compare three elements and sort them
        if (n == 3) {
            if(arr[0] > arr[1]) {
                if(arr[0] > arr[2]) {
                    res[2] = arr[0];
                    if(arr[2] > arr[1]) {
                        res[1] = arr[2];
                        res[0] = arr[1];
                    } else {
                        res[1] = arr[1];
                        res[0] = arr[2];
                    }

                } else {
                    res[2] = arr[2];
                    res[1] = arr[0];
                    res[0] = arr[1];
                }
            } else {
                if(arr[1] > arr[2]) {
                    res[2] = arr[1];
                    if(arr[2] > arr[0]) {
                        res[1] = arr[2];
                        res[0] = arr[0];
                    } else {
                        res[1] = arr[1];
                        res[0] = arr[2];
                    }
                } else {
                    res[2] = arr[2];
                    res[1] = arr[1];
                    res[0] = arr[0];
                }
            }
            return res;
        }

        res = fun(arr, n - 1);
        if(arr[n-1] > res[2]) {
            res[0] = res[1];
            res[1] = res[2];
            res[2] = arr[n-1];
        } else if (arr[n-1] < res[2] && arr[n-1] > res[1]) {
            res[0] = res[1];
            res[1] = arr[n-1];
        } else if (arr[n-1] < res[1] && arr[n-1] > res[0]) {
            res[0] = arr[n-1];
        }
        return res;

    }
}

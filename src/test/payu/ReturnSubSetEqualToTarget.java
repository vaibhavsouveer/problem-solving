package test.payu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReturnSubSetEqualToTarget {
    static int target = 2;
    public static void main(String[] args) {

        int[] arr = {2,7,1,6,1};
        getSubsets(arr, arr.length, target);
        System.out.println();
    }

    public static List<Integer> getSubsets(int[] arr, int n, int S) {
        if(n >= 1) {
            int num = arr[n-1];
            if(n == 1) {
                if(S-num == 0) {
                    return Arrays.asList(num);
                } else {
                    return new ArrayList<>();
                }
            } else {
                if(S-num == 0) {
                    return Arrays.asList(num);
                }
                if(num > S) {
                    List<Integer> res = getSubsets(arr, n-1, S);
                    if(res.isEmpty()) {
                        return res;
                    } else {
                        res.add(num);
                        return res;
                    }
                } else {
                    getSubsets(arr, n-1, S-num);
                    getSubsets(arr, n-1, S);
                }
            }
        }
        return new ArrayList<>(); // to resolve error
    }
}

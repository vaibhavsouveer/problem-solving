package revision;

import commons.util.array.ArrayUtil;

public class Revision {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        heapSort(arr);
        ArrayUtil.printArray(arr);
    }

    private static int getParent(int i) {
        return (i-1)/2;
    }

    private static int getLeftChild(int i) {
        return 2*i+1;
    }

    private static int getRightChild(int i) {
        return 2*(i+1);
    }

    private static void swap(int[] arr, int largest, int i) {
        arr[largest] = arr[i] + arr[largest];
        arr[i] = arr[largest] - arr[i];
        arr[largest] = arr[largest] - arr[i];
    }

    private static void heapify(int[] arr, int i, int heapIndex) {
        int lIndex = getLeftChild(i);
        int rIndex = getRightChild(i);
        int largest;
        if(lIndex <= heapIndex && arr[lIndex] > arr[i]) {
            largest = lIndex;
        } else {
            largest = i;
        }
        if(rIndex <= heapIndex && arr[rIndex] > arr[largest]) {
            largest = rIndex;
        }
        if(largest != i) {
            swap(arr, largest, i);
            heapify(arr, largest, heapIndex);
        }
    }

    private static void buildMaxHeap(int [] arr) {
        int firstNonLeafIndex = arr.length/2-1;
        while(firstNonLeafIndex >= 0) {
            heapify(arr, firstNonLeafIndex, arr.length-1);
            firstNonLeafIndex--;
        }
    }

    private static void heapSort(int[] arr) {
        int heapIndex = arr.length-1;
        buildMaxHeap(arr);
        while(heapIndex >= 0) {
            swap(arr, 0, heapIndex);
            heapIndex--;
            heapify(arr, 0, heapIndex);
            ArrayUtil.printArray(arr);
        }

    }


}

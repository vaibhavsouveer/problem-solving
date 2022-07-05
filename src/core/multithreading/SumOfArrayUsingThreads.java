package core.multithreading;

import java.util.concurrent.Callable;

public class SumOfArrayUsingThreads {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberOfThreads = 2;
        int countInEachThread = arr.length/numberOfThreads;
        int[] threadSum = new int[numberOfThreads];
        for(int i = 0; i < numberOfThreads; i++) {
            threadSum[i] = new Sum(arr, i*countInEachThread, (i+1)*countInEachThread-1).call();
            System.out.println("Sum in thread" + (i+1) + " = " + threadSum[i]);
        }
        System.out.println("Total sum = " + (threadSum[0]+threadSum[1]));
    }
}


class Sum implements Callable {
    int[] arr;
    int s;
    int e;

    public Sum(int[] arr, int s, int e) {
        this.arr = arr;
        this.s = s;
        this.e = e;
    }

    @Override
    public Integer call() {
        int sum = 0;
        while(s <= e) {
            sum = sum + arr[s];
            s++;
        }
        return sum;
    }
}

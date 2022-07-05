package core.multithreading;

class MyT implements Runnable {
    @Override
    public  void run() {
        System.out.println("Running run in MyT");
    }
}
/*
This example explains how to create and run threads.
 */
public class ThreadCreation {
    public static void main(String[] args) {
        Thread t = new Thread(new MyT()); // can use lambda here
        t.start();

        // this will not work at compile time
        // ob is a Runnable which does not have a start method
        MyT ob = new MyT();
        //ob.start();
    }
}

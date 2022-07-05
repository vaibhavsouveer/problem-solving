package core.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Callable c = () -> 10;
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future submit = ex.submit(c);
        System.out.println("o = " + submit.get());
    }
}

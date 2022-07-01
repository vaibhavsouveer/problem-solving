package dsa.algo.recursion;

import java.time.Duration;
import java.time.LocalDateTime;

/*
    Recursive code for Fibonacci
    If input becomes large (above 45) the computation time becomes higher
    Refer link for Fibonacci - http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
 */
public class Fibonacci {
    public static void main(String[] args) {
        int input = 60;
        LocalDateTime start = LocalDateTime.now();
        System.out.println("fibonacci() = " + fibonacci(input));
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Duration = " + Duration.between(start, end).getSeconds());
    }

    static long fibonacci(long input) {
        if(input == 1) return 0;
        else if (input == 2) return 1;
        else return fibonacci(input-1) + fibonacci(input-2);
    }
}

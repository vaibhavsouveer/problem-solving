package dsa.recursion;

public class ReverseNumber {
    static int product = 1;
    public static void main(String[] args) {
        int n = 123400;
        System.out.println("reverse = " + fun(n));
    }

    private static int fun(int n) {
        if(n % 10 == n) {
            return n;
        }
        int temp = fun(n / 10);
        product = product * 10;
        return (n % 10) * product + temp;
    }
    /*
        note how we are updating the value of product. It is happening after the recursive calls are made as we want
        to increment by 10 only after the sub part  of the number is reversed not before that.
     */


}

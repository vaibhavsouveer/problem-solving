package tests.paytm.round1;

public class PlayString {
    public static void main(String[] args) {
        StringBuilder str1 =  new StringBuilder("abc");
        StringBuilder str2 =  new StringBuilder("abc");
        System.out.println("str1 == str2 = " + (str1 == str2));
        // StringBuilder does not have any equals method so it will use that of object class
        // and so below statement will return false
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
    }
}

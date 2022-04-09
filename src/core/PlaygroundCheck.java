package core;

import java.util.Arrays;
import java.util.List;

public class PlaygroundCheck {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "ab";

        System.out.println("s1 == s1 = " + s1 == s2);
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.concat(s2) = " + s1.concat(s2));
        s1.concat(s2);
        System.out.println("s1 = " + s1);

    }
}

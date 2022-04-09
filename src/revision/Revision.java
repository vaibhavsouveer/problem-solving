package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Revision {
    public static void main(String[] args) {
        String x = "abc";
        System.out.println("Permutations = " + fun(x, 0, ""));
    }

    private static List<String> fun(String a, int i, String output) {
        if(i == a.length()) {
            return Arrays.asList(output);
        }

        List<String> res =  new ArrayList<>();
        for(int j = 0; j <= output.length(); j++) {
            StringBuilder tempOutput = new StringBuilder(output);
            res.addAll(fun(a, i+1, tempOutput.insert(j, a.charAt(i)).toString()));
        }
        return res;
    }
}

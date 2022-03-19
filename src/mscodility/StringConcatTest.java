package mscodility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatTest {
    public static void main(String[] args) {
        System.out.println("solution() = " + solution(new String[] {"abc", "yyy", "def", "csv"}));
    }

    public static int solution(String[] A) {
        List<String> list = Arrays.asList(A);
        List<String> uniqueList = list.stream()
                .filter(input -> isStringUnique(input))
                .collect(Collectors.toList());
        System.out.println("uniqueList = " + uniqueList);

        return 0;
    }

    public static boolean isStringUnique(String input) {
        List<Character> presentCharacters = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(presentCharacters.contains(c)) {
                return false;
            } else {
                presentCharacters.add(c);
            }
        }
        return true;
    }
}

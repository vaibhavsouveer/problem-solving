package core.string;

public class AllStringSubsets {
    public static void main(String[] args) {
        String input = "abcd";
        //printAllSubsets(input);
        printAllSubsetsTypeTwo(input);
    }

    /*
    OUTPUT
        a
        ab
        abc
        abcd
        b
        bc
        bcd
        c
        cd
        d
     */
    static void printAllSubsets(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }

    /*
    OUTPUT
        a
        b
        c
        d
        ab
        bc
        cd
        abc
        bcd
        abcd
     */
    static void printAllSubsetsTypeTwo(String input) {
        for (int n = 0; n < input.length(); n++) {
            for (int i = 0; n + i + 1 <= input.length(); i++) {
                System.out.println(input.substring(i, n + i + 1));
            }
        }
    }


}

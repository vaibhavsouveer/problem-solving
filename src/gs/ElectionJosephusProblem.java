package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectionJosephusProblem {
    public static void main(String[] args) {
        ElectionJosephusProblem jp = new ElectionJosephusProblem();
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 2;
        System.out.println(jp.solveJosephus(input, 0, k));
    }

    private int solveJosephus(List<Integer> input, int start, int k) {
        if(input.size() == 1) {
            return input.get(0);
        }
        start = (start + k - 1) % input.size();
        input.remove(start);
        return solveJosephus(input, start, k);
    }
}

package test.line_test.solution3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[][] jobs = {{1, 5, 2, 3}, {2, 2, 3, 2}, {3, 1, 3, 3}, {5, 2, 1, 5}, {7, 1, 1, 1}, {9, 1, 1, 1}, {10, 2, 2, 9}};
        Solution3 sol = new Solution3();
        int[] answer = sol.solution(jobs);
        System.out.println(Arrays.toString(answer));
    }
}

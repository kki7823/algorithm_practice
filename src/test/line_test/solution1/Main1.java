package test.line_test.solution1;

public class Main1 {
    public static void main(String[] args) {
        int[] student = {0, 1, 0, 0};
        int k = 1;

        Solution1 sol = new Solution1();
        int answer = sol.solution(student, k);
        System.out.println(answer);
    }
}

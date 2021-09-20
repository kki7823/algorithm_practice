package test.kakao_test.solution3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] fees = {180, 5000, 10, 600};
        String[] record = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        Solution3 sol = new Solution3();
        int[] answer = sol.solution(fees,record);

        System.out.println(Arrays.toString(answer));
    }
}

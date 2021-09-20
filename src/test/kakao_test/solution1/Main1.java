package test.kakao_test.solution1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        Solution1 sol = new Solution1();
        int[] answer = sol.solution(id_list, report, k);
        System.out.println(Arrays.toString(answer));
    }
}

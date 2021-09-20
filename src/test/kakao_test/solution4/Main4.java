package test.kakao_test.solution4;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int n = 9;
        int[] info = {0,0,1,2,0,1,1,1,1,1,1};
        Solution4 sol = new Solution4();
        int[] answer = sol.solution(n,info);

        System.out.println("answer :"+Arrays.toString(answer));
    }
}

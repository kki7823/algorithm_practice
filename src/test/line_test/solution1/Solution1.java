package test.line_test.solution1;

import java.util.Arrays;

class Solution1 {
    public int solution(int[] student, int k) {
        int answer = -1;

        if (countStudent(student, 1) != k) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i <= student.length; i++) {
            int[] arr = new int[i];
            for (int j = 0; arr.length + j <= student.length; j++) {
                arr = Arrays.copyOfRange(student, j, arr.length + j);
                if (countStudent(arr, 1) == k) {
                    count++;
                }
            }
        }

        answer = count;
        return answer;
    }

    public int countStudent(int[] student, int s) {
        int count = 0;

        for (int i = 0; i < student.length; i++) {
            if (student[i] == s)
                count++;
        }
        return count;
    }
}

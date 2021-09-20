package test.line_test.solution2;

import java.util.*;

public class Solution2 {
    public String solution(String[] research, int n, int k) {
        String answer = "";
        char answerChar = 'z' +1;

        Map<Character, int[]> issueMap = new HashMap<>();

        for (int i = 0; i < research.length; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                int count = countChar(research[i], c);

                if (k <= count) {
                    if (issueMap.containsKey(c)) {
                        issueMap.get(c)[i] = count;
                    } else {
                        int[] countArr = new int[research.length];
                        countArr[i] = count;
                        issueMap.put(c, countArr);
                    }
                }

            }
        }
        System.out.println(Arrays.toString(issueMap.get('x')));
        System.out.println(Arrays.toString(issueMap.get('y')));
        System.out.println(Arrays.toString(issueMap.get('z')));

        Set issueSet = issueMap.keySet();
        Iterator it = issueSet.iterator();

        while (it.hasNext()) {
            char c = (char) it.next();
            int[] countArr = issueMap.get(c);
            int[] arr = new int[n];
            for (int j = 0; arr.length + j <= countArr.length; j++) {
                arr = Arrays.copyOfRange(countArr, j, arr.length + j);

                if (sumArr(arr) >= 2 * n * k && checkArr(arr)) {
                   if(c < answerChar){
                       answerChar = c;
                   }
                }
            }
        }


        System.out.println(answerChar);
        answer = String.valueOf(answerChar);
        if(answerChar > 'z'){
            return "None";
        }
        return answer;
    }

    public static int countChar(String s, char ch) {
        return (int) s.chars().filter(c -> c == ch).count();
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean checkArr(int[] arr) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                b = true;
            }else {
                b = false;
                break;
            }
        }
        return b;
    }

}

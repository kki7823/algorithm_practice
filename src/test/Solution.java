package test;


import java.util.*;

public class Solution {
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();
        //임시 -> 반복처리

        for (int j = 0; j < course.length; j++) {
            List<String> result = new ArrayList<>();
            int courseNum = course[j];

            for (int i = 0; i < orders.length; i++) {
                char[] temp = new char[courseNum];
                char[] arr = orders[i].toCharArray();
                Arrays.sort(arr);
                com(arr, courseNum, 0, 0, result, temp);
            }
            if (!result.isEmpty()) {
                countArr(result, answerList);
            }
        }

        Collections.sort(answerList);
        answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }

    public void com(char[] orders, int courseNum, int n, int r, List<String> result, char[] temp) {
        int depth = courseNum;
        int index = orders.length;

        if (r == depth) {
            result.add(String.valueOf(temp));
            return;
        }

        if (n == index) {
            return;
        }

        temp[r] = orders[n];
        com(orders, courseNum, n + 1, r + 1, result, temp);
        com(orders, courseNum, n + 1, r, result, temp);
    }

    public void countArr(List<String> list, List<String> answerList) {
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!countMap.containsKey(str)) {
                countMap.put(str, 1);
            } else {
                countMap.replace(str, countMap.get(str) + 1);
            }
        }


        int maxValue = Collections.max(countMap.values());
        for (Map.Entry<String, Integer> e : countMap.entrySet()) {
            if (e.getValue() != 1 && e.getValue() == maxValue) {
                answerList.add(e.getKey());
            }
        }
    }
}

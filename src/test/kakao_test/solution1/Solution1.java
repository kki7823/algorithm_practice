package test.kakao_test.solution1;

import java.util.*;

public class Solution1 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int[] result = new int[id_list.length];
        int[] reportCount = new int[id_list.length];

        //report중복 제거
        HashSet<String> reportSet = new HashSet<>();
        for (String s : report) {
            reportSet.add(s);
        }
        report = new String[reportSet.size()];
        report = reportSet.toArray(report);

        //아이디 인덱스 매핑
        Map<String, Integer> userIdx = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            userIdx.put(id_list[i], i);
        }

        //유저별 신고당한 횟수 카운팅
        for (int i = 0; i < report.length; i++) {
            String[] splitedStr = report[i].split(" ");
            String reportedUser = splitedStr[1];

            reportCount[userIdx.get(reportedUser)] += 1;
        }

        //k이상 신고한 유저에 대해 해당 유저 신고한 유저의 메일 횟수 카운팅
        for (int i = 0; i < reportCount.length; i++) {
            if (reportCount[i] >= k) {
                for (int j = 0; j < report.length; j++) {
                    String[] splitedStr = report[j].split(" ");
                    String id = splitedStr[0];
                    String reportedUser = splitedStr[1];
                    if (userIdx.get(reportedUser) == i) {
                        result[userIdx.get(id)] += 1;
                    }
                }
            }
        }


        answer = result;
        return answer;
    }
}

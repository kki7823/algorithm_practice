package test.kakao_test.solution3;

import java.util.*;

public class Solution3 {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        Map<String, Integer> cumulativeTime = new HashMap<>();
        Map<String, String> carInout = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            String[] splitedRecord = records[i].split(" ");
            String time = splitedRecord[0];
            String carNumber = splitedRecord[1];
            String inOrOut = splitedRecord[2];

            if (cumulativeTime.containsKey(carNumber)) {
                if (inOrOut.equals("IN")) {
                    int newTime = cumulativeTime.get(carNumber) - timeToMin(time);
                    cumulativeTime.replace(carNumber, newTime);
                } else if (inOrOut.equals("OUT")) {
                    int newTime = cumulativeTime.get(carNumber) + timeToMin(time);
                    cumulativeTime.replace(carNumber, newTime);
                }
            } else {
                cumulativeTime.put(carNumber, -timeToMin(time));
            }

            carInout.put(carNumber, inOrOut);
        }

        Iterator<Map.Entry<String, String>> iterator = carInout.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> temp = iterator.next();
            if (temp.getValue().equals("IN")) {
                String carNumber = temp.getKey();
                int newTime = cumulativeTime.get(carNumber) + timeToMin("23:59");
                cumulativeTime.replace(carNumber, newTime);
            }
        }

        Object[] carNoArr = cumulativeTime.keySet().toArray();
        Arrays.sort(carNoArr);

        answer = new int[carNoArr.length];
        for (int i = 0; i < carNoArr.length; i++) {
            int resultFee = 0;
            int parkTime = cumulativeTime.get((String) carNoArr[i]);

            if (parkTime > fees[0]) {
                double p = fees[0];
                double q = fees[2];
                double r = (((double) parkTime - fees[0]) / fees[2]);
                resultFee = fees[1] + (int) Math.ceil(r) * fees[3];
            } else {
                resultFee = fees[1];
            }
            answer[i] = resultFee;
        }

        return answer;
    }

    public int timeToMin(String time) {
        String[] splitedTime = time.split(":");
        int result = 0;
        result += Integer.parseInt(splitedTime[0]) * 60;
        result += Integer.parseInt(splitedTime[1]);

        return result;
    }

}

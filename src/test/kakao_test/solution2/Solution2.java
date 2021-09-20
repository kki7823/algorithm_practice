package test.kakao_test.solution2;

public class Solution2 {
    public int solution(int n, int k) {
        int answer = -1;
        String N = "";
        N = kNumeration(n, k, N);
        int resultCount = 0;
        String[] splitedN = N.split("0");

        for (String s : splitedN) {
            if (!s.equals("") && isPrimeNumber(Integer.parseInt(s))) {
                resultCount++;
            }
        }

        answer = resultCount;
        return answer;
    }

    public String kNumeration(int n, int k, String result) {

        if (n < k) {
            return result + (n % k);
        }
        return kNumeration(n / k, k, result) + (n % k);
    }

    public boolean isPrimeNumber(int n) {
        if (n == 1 || n == 0) {
            return false;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return (count == 2);
    }
}

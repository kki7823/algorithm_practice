package test.kakao_test.solution4;

import java.util.Arrays;

public class Solution4 {
    int maxScoreGap = 0;
    int[] lowRyanScore = new int[11];

    public int[] solution(int n, int[] info) {
        int[] answer = {};
        int[] fail = {-1};

        int[] score = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] IdxArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] temp = new int[n];
        apeachVsRyan(0, 0, IdxArr, temp, info, score, n);

        System.out.println(Arrays.toString(lowRyanScore));

        if (sumRowArr(lowRyanScore) == 0) {
            answer = fail;
        } else {
            answer = lowRyanScore;
        }

        return answer;
    }

    public void apeachVsRyan(int p, int q, int[] idxArr, int[] temp, int[] apeachInfo, int[] score, int n) {
        int depth = n;
        int index = 11;

        if (q == depth) {
            System.out.println(Arrays.toString(temp));
            int[] ryanInfo = new int[idxArr.length];
            Arrays.fill(ryanInfo, 0);
            for (int i = 0; i < temp.length; i++) {
                ryanInfo[temp[i]] += 1;
            }

            int apeachSore = 0;
            int ryanScore = 0;


            for (int i = 0; i < ryanInfo.length; i++) {

                if (apeachInfo[i] == ryanInfo[i] && apeachInfo[i] != 0 && ryanInfo[i] != 0) {
                    apeachSore += score[i];
                } else if (apeachInfo[i] > ryanInfo[i]) {
                    apeachSore += score[i];
                } else if (apeachInfo[i] < ryanInfo[i]) {
                    ryanScore += score[i];
                }
            }
//            System.out.println(Arrays.toString(apeachInfo) + "score : " + apeachSore + " vs " + Arrays.toString(ryanInfo) + "score : " + ryanScore);
            if (ryanScore > apeachSore) {
                if (this.maxScoreGap <= ryanScore - apeachSore) {
                    this.maxScoreGap = ryanScore - apeachSore;
                    lowRyanScore = ryanInfo;
                }
            }
            return;
        }

        if (p == index) {
            return;
        }

        temp[q] = idxArr[p];
        apeachVsRyan(p, q + 1, idxArr, temp, apeachInfo, score, n);
        apeachVsRyan(p + 1, q, idxArr, temp, apeachInfo, score, n);
    }

    public int sumRowArr(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

}



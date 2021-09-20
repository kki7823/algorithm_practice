package test.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DFS2 {
    public static void main(String[] args) {
        int n = 7;
        int start = 0;
        int[][] map = {
                {0, 1, 1, 0, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}};

        boolean[] visit = new boolean[n];
        Arrays.fill(visit, false);
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visit[start] = true;
        System.out.println(start + " ");

        while (!stack.isEmpty()) {
            int w = stack.peek();
            boolean flag = false;

            for (int j = 0; j < n; j++) {
                if (map[w][j] == 1 && !visit[j]) {
                    stack.push(j);
                    visit[j] = true;
                    System.out.println(j + " ");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stack.pop();
            }
        }
    }


}

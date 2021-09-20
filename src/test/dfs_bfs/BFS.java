package test.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
        Queue<Integer> queue = new LinkedList<>();


        queue.add(start);
        visit[start] = true;
        System.out.println(start + " ");

        while (!queue.isEmpty()) {
            int w = queue.poll();

            for (int i = 0; i < n; i++) {
                if (map[w][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                    System.out.println(i + " ");
                }
            }
        }

    }
}

package test.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Maze_Temp {
    public static void main(String[] args) {
        int N = 4;
        int M = 6;
        int[][] map = {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1}};

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visit = new boolean[N][M];

        Queue<Dot> queue = new LinkedList<>();
        queue.add(new Dot(0, 0));
        visit[0][0] = true;

        while (!queue.isEmpty()) {
            Dot dot = queue.poll();

            int currentX = dot.x;
            int currentY = dot.y;

            for (int i = 0; i < 4; i++) {
                int nextX = currentX + dx[i];
                int nextY = currentY + dy[i];

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) {
                    continue;
                }

                if (map[nextX][nextY] == 0 || visit[nextX][nextY]) {
                    continue;
                }

                visit[nextX][nextY] = true;
                queue.add(new Dot(nextX, nextY));
                map[nextX][nextY] = map[currentX][currentY] + 1;
            }

        }

        System.out.println(map[N-1][M-1]);
    }

}

package test.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/* 주어진 미로(1: 이동가능, 0: 이동불가)에 대하여 출발점 (0,0) 에서 도착점 (N,M) 까지의 최소 이동수 구하기 */
public class Maze {
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

        visit[0][0] = true;
        queue.add(new Dot(0, 0));

        while (!queue.isEmpty()) {
            Dot dot = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = dot.x + dx[i];
                int nextY = dot.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                if (visit[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }

                queue.add(new Dot(nextX, nextY));
                map[nextX][nextY] = map[dot.x][dot.y] + 1;
                visit[nextX][nextY] = true;
            }
        }

        System.out.println(Arrays.deepToString(map));
    }
}

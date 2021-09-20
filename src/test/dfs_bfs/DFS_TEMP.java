package test.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS_TEMP {


    public static void main(String[] args) {
        int[][] map = {
                {0, 1, 1, 0, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}};

        int N = 7;

        System.out.print("dfs recursion : ");
        dfsWithRecursion(map, N, 0);
        System.out.println("");

        System.out.print("dfs stack : ");
        dfsWithStack(map, N, 0);
        System.out.println("");

        System.out.print("bfs : ");
        bfs(map, N, 0);
    }

    public static void dfsWithRecursion(int[][] map, int N, int start) {
        boolean[] visit = new boolean[N];
        Arrays.fill(visit, false);

        dfs(map, N, visit, start);
    }

    public static void dfs(int[][] map, int N, boolean[] visit, int v) {
        visit[v] = true;
        System.out.print(v + " ");

        for (int i = 0; i < N; i++) {
            if (map[v][i] != 0 && !visit[i]) {
                dfs(map, N, visit, i);
            }
        }
    }

    public static void dfsWithStack(int[][] map, int N, int start) {
        boolean[] visit = new boolean[N];
        Arrays.fill(visit, false);

        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visit[start] = true;
        System.out.print(start + " ");

        while (!stack.isEmpty()) {
            boolean flag = false;
            int i = stack.peek();

            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0 && !visit[j]) {
                    stack.push(j);
                    visit[j] = true;
                    System.out.print(j + " ");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stack.pop();
            }
        }
    }

    public static void bfs(int[][] map, int N, int start) {
        boolean[] visit = new boolean[N];
        Arrays.fill(visit, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        System.out.print(start+" ");

        while (!queue.isEmpty()) {
            int i = queue.poll();

            for (int j = 0; j < N; j++) {
                if (!visit[j] && map[i][j] != 0) {
                    queue.add(j);
                    visit[j] = true;
                    System.out.print(j+" ");
                }else {
                    continue;
                }
            }
        }
    }

}

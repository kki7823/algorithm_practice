package test.floyd;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Floyd floyd = new Floyd();

        int INF = 100000;
        int[][] map = {
                {0, 2, 1, INF, INF},
                {2, 0, 2, 3, INF},
                {1, 2, 0, 1, 8},
                {INF, 3, 1, 0, 2},
                {INF, INF, 8, 2, 0}};

        int[][] distance = floyd.getFloyd(map, 5);
        System.out.println(Arrays.deepToString(distance));
    }
}

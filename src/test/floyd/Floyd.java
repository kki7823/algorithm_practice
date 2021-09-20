package test.floyd;

public class Floyd {
    public int[][] getFloyd(int[][] map, int n) {
        int[][] distance = new int[n][n];
        int INF = 100000;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    distance[i][j] = 0;
                } else if (map[i][j] != 0) {
                    distance[i][j] = map[i][j];
                } else {
                    distance[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                }
            }
        }

        return distance;
    }
}


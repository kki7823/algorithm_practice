package test;

import java.util.Arrays;

public class Dijkstra {
    int v;
    int[] distance;
    boolean[] check;
    int[][] map;

    public Dijkstra(int[][] map, int v) {
        //1. 초기화
        this.v = v;
        this.map = map;
        distance = new int[v + 1];
        check = new boolean[v + 1];

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(check, false);
    }

    public int getShortPath(int start, int end) {
        //2. 시작 노드 초기화 , 체크
        distance[start] =0;
        check[start] = true;

        // 3. 시작노드로 부터의 distance 배열 초기화
        for (int i = 0; i < v + 1; i++) {
            distance[i] = map[start][i];
        }

        // 4. distance 배열중 최소값 선택
        for (int i = 0; i < v; i++) {
            int min = 100000;
            int min_node_idx = -1;

            for (int j = 0; j < v + 1; j++) {
                if (!check[j] && distance[j] != 100000) {
                    if (min > distance[j]) {
                        min = distance[j];
                        min_node_idx = j;
                    }
                }
            }

            // 5. distance[현재노드] > distance[선택한 최소값 노드] + 선택한 최소값노드랑 현재노드 사이 거리 => 참이면 값 갱신
            check[min_node_idx] = true;
            for (int k = 0; k < v + 1; k++) {
                if (!check[k] && map[min_node_idx][k] != 0) {
                    if (distance[k] > distance[min_node_idx] + map[min_node_idx][k])
                        distance[k] = distance[min_node_idx] + map[min_node_idx][k];
                }
            }
        }

        System.out.println(Arrays.toString(distance));
        System.out.println(Arrays.toString(check));
        return distance[end];
    }
}


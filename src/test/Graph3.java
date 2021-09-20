package test;

//가중치 그래프 : 2차원배열로 구현 하는게 편함
public class Graph3 {

    int map[][];
    int v;

    //노드 갯수 입력 0~노드 까지 생성
    public Graph3(int v) {
        this.v = v;
        map = new int[v + 1][v + 1];

        for (int i = 0; i < v + 1; i++) {
            for (int j = 0; j < v + 1; j++) {
                map[i][j] = 100000;
            }
        }
    }

    public void addEdge(int v1, int v2, int w) {
        map[v1][v2] = w;
    }

}

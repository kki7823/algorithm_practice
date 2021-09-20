package test;

import java.util.LinkedList;

public class Graph2 {
    public LinkedList[] adj;

    //노드 추가 0~v까지
    public Graph2(int v) {
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }

}

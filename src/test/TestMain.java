package test;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
//        Graph3 graph = new Graph3(5);
//        graph.addEdge(0, 0, 0);
//        graph.addEdge(0, 1, 4);
//        graph.addEdge(0, 2, 3);
//        graph.addEdge(0, 4, 1);
//
//        graph.addEdge(1, 1, 0);
//        graph.addEdge(1, 0, 4);
//        graph.addEdge(1, 3, 3);
//        graph.addEdge(1, 5, 2);
//
//        graph.addEdge(2, 2, 0);
//        graph.addEdge(2, 0, 3);
//        graph.addEdge(2, 3, 2);
//        graph.addEdge(2, 4, 1);
//
//        graph.addEdge(3, 3, 0);
//        graph.addEdge(3, 1, 3);
//        graph.addEdge(3, 2, 2);
//        graph.addEdge(3, 5, 1);
//
//        graph.addEdge(4, 4, 0);
//        graph.addEdge(4, 0, 1);
//        graph.addEdge(4, 2, 1);
//
//        graph.addEdge(5, 5, 0);
//        graph.addEdge(5, 1, 2);
//        graph.addEdge(5, 3, 1);

        Graph3 graph = new Graph3(3);
        graph.addEdge(0, 0, 0);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 20);

        graph.addEdge(1, 0, 1);
        graph.addEdge(1, 1, 0);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 10);

        graph.addEdge(2, 0, 20);
        graph.addEdge(2, 1, 1);
        graph.addEdge(2, 2, 0);
        graph.addEdge(2, 3, 1);

        graph.addEdge(3, 1, 10);
        graph.addEdge(3, 2, 1);
        graph.addEdge(3, 3, 0);

        System.out.println(Arrays.deepToString(graph.map));
        Dijkstra dijkstra = new Dijkstra(graph.map, graph.v);
        System.out.println(dijkstra.getShortPath(0,3));
    }
}

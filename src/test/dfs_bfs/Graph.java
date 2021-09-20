package test.dfs_bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        this.v = v;

        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void dfs(int v) {
        boolean visited[] = new boolean[this.v];
        dfsUtil(v, visited);
    }

    public void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> it = adj[v].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            if (!visited[n])
                dfsUtil(n, visited);
        }
    }

    public void bfs(int s){
        boolean visited[] =  new boolean[this.v];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0){
            s = queue.poll();
            System.out.println(s);

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public void dfsUseStack(){

    }

}

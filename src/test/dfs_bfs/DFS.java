package test.dfs_bfs;

import java.util.*;

public class DFS {
    private boolean[] visit;

    public DFS(int n) {
        this.visit = new boolean[n];
        Arrays.fill(visit, false);
    }

    public void dfs(LinkedList<Integer>[] adj, int v) {
        System.out.println(v + " ");

        Iterator<Integer> iterator = adj[v].listIterator();
        while (iterator.hasNext()) {
            int m = iterator.next();
            if (!visit[m]) {
                visit[m] = true;
                dfs(adj, m);
            }
        }
    }
}
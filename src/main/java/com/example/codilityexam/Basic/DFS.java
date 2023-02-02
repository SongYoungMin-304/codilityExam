package com.example.codilityexam.Basic;

import java.util.LinkedList;

public class DFS {

    private int V;
    private LinkedList<Integer>[] adj;
    private boolean[] visited;

    public DFS(int V){
        this.V = V;
        adj = new LinkedList[V];
        visited = new boolean[V];

        for(int a = 0; a < adj.length; a++){
            adj[a] = new LinkedList();
        }
    }

    public void connect(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }

    public void DFSFunction(int v){
        visited[v] = true;

        System.out.println(v);
        for(int a = 0; a < adj[v].size(); a++){
            if(!visited[adj[v].get(a)]){
                DFSFunction(adj[v].get(a));
            }
        }
    }

    //  0
    // 1 2
    //3 4 5
    public static void main(String[] args) {
        DFS dfs = new DFS(6);

        dfs.connect(0,1);
        dfs.connect(0,2);
        dfs.connect(1,3);
        dfs.connect(1,4);
        dfs.connect(2,4);
        dfs.connect(2,5);

        dfs.DFSFunction(0);
    }

}

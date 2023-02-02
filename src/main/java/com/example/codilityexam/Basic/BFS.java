package com.example.codilityexam.Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private int V;
    private LinkedList<Integer>[] adj;
    private boolean[] visited;

    public BFS(int V){
        this.V = V;
        adj = new LinkedList[V];
        visited = new boolean[V];

        for(int a =0; a < V; a++){
            adj[a] = new LinkedList<>();
        }
    }

    public void connect(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }

    public void BFSFunction(int V){

        Queue queue = new LinkedList();
        queue.add(V);
        visited[V] = true;

        while(queue.size()!=0){
            int t = (int) queue.poll();
            System.out.println(t);

            for(int a = 0; a < adj[t].size(); a++){
                if(!visited[adj[t].get(a)]){
                    visited[adj[t].get(a)] = true;
                    queue.add(adj[t].get(a));
                }
            }
        }
    }

    //  0
    // 1 2
    //3 4 5
    public static void main(String[] args) {
        BFS bfs = new BFS(6);

        bfs.connect(0,1);
        bfs.connect(0,2);
        bfs.connect(1,3);
        bfs.connect(1,4);
        bfs.connect(2,4);
        bfs.connect(2,5);

        bfs.BFSFunction(0);
    }

}

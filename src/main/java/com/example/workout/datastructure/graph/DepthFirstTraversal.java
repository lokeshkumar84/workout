package com.example.workout.datastructure.graph;

import java.util.*;

public class DepthFirstTraversal{

    public  Map<Integer,List<Integer>> adjVertex;

    DepthFirstTraversal(){
        adjVertex = new HashMap<Integer, List<Integer>>();
    }

    //Add node/vertex to the graph
    public  void addVertex(int vertex){
        adjVertex.putIfAbsent(vertex,new ArrayList<>());
    }

    //Add edge to the vertex or nodes. (->)
    public  void addEdge(int source, int destination){
        adjVertex.get(source).add(destination);
    }


    public void DepthFirstTraversal(int vertex){
        Set<Integer> visited = new HashSet<Integer>();
        dfs(vertex, visited);
    }

    public void dfs(int current, Set<Integer> visited){

        visited.add(current);

        System.out.println(current + " ");

        for(int adj:adjVertex.get(current)){
            if(!visited.contains(adj)){
                dfs(adj,visited);
            }
        }

    }

    public boolean hasPath(int source, int destination){

        Set<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(source, destination, visited);
    }

    private static boolean hasPath;

    private boolean hasPathDFS(int current, int destination, Set<Integer> visited){

        visited.add(current);
        if(current == destination){
            hasPath = true;
        }
        for(int node:adjVertex.get(current)){
            if(!visited.contains(node)){
                hasPathDFS(node,destination,visited);
            }
        }

        return hasPath;
    }

}

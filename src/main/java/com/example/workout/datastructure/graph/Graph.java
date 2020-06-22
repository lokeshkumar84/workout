package com.example.workout.datastructure.graph;

public class Graph{

    public static void main(String[] args){

        DepthFirstTraversal dfs = new DepthFirstTraversal();

        dfs.addVertex(1);
        dfs.addVertex(2);
        dfs.addVertex(3);
        dfs.addVertex(0);
        dfs.addVertex(4);
        dfs.addVertex(5);

        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        //dfs.addEdge(1,3);
        //dfs.addEdge(1,4);
        //dfs.addEdge(1,5);
        dfs.addEdge(5,1);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);

        dfs.DepthFirstTraversal(0);


        System.out.println("is there path between 3 and 4: " + dfs.hasPath(3,4));
    }

}

package com.example.workout.datastructure.binaryTree;

public class BinaryTreeExec{

    public static void main(String[] args){

        BinaryTree bt = new BinaryTree();

        System.out.println("-----Add Node-------");
        bt.addNode(8);
        bt.addNode(6);
        bt.addNode(18);
        bt.addNode(5);
        bt.addNode(7);
        bt.addNode(9);
        bt.addNode(20);


        System.out.println("-----Find Node-------");
        System.out.println("20: "+bt.findNode(20));
        System.out.println("10: "+bt.findNode(10));
        System.out.println("9: "+bt.findNode(9));
        System.out.println("6: "+bt.findNode(6));
        System.out.println("9: "+bt.findNode(9));


        System.out.println("-------Traverse in DFS-------");

        System.out.println("---------InOrder----------");
        bt.DFS_InOrder();
        System.out.println("---------PreOrder----------");
        bt.DFS_PreOrder();
        System.out.println("---------PostOrder----------");
        bt.DFS_PostOrder();

        System.out.println("-------Traverse in BFS-------");
        bt.BFS();


        System.out.println("-----Delete Node-------");

        System.out.println("Delete 18... ");
        bt.deleteNode(18);
        bt.DFS_InOrder();

        System.out.println("Delete 8... ");
        bt.deleteNode(8);
        bt.DFS_InOrder();

        System.out.println("Delete 6... ");
        bt.deleteNode(6);
        bt.DFS_InOrder();

    }

}

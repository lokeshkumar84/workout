package com.example.workout.datastructure.binaryTree;

//https://www.baeldung.com/java-binary-tree
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{

    Node root;

    //BinaryTree CRUD:

    public void addNode(int value){
        root = recursiveAddNode(root, value);
    }

    public boolean findNode(int value){
        return recursiveFindNode(root, value);
    }

    public void deleteNode(int value){
        root = recursiveDeleteNode(root, value);
    }

    public void DFS_InOrder(){

        root = recursiveDFSInOrder(root);
    }

    public void DFS_PreOrder(){
        root = recursiveDFSPreOrder(root);
    }

    public void DFS_PostOrder(){
        root = recursiveDFSPostOrder(root);
    }

    public void BFS(){
        recursiveBFS(root);
    }


    //Implementation methods;

    private Node recursiveAddNode(Node current, int value){

        if(current == null){
            return new Node(value);
        }
        if(value <= current.data){
            current.left = recursiveAddNode(current.left, value);
        }
        if(value > current.data){
            current.right = recursiveAddNode(current.right, value);
        }

        return current;
    }

    private boolean recursiveFindNode(Node current, int value){

        if(current == null){
            return false;
        }
        if(current.data == value){
            return true;
        }
        else {
            if(value <= current.data){
                return recursiveFindNode(current.left, value);
            }
            if(value > current.data){
                return recursiveFindNode(current.right, value);
            }
        }

        return false;

    }

    private Node recursiveDeleteNode(Node current, int value){

        if(current == null){
            return null;
        }
        if(current.left == null && current.right == null){
            return null;
        }
        if(current.data == value){

            if(current.left == null){
                current = current.right;
            }
            else if(current.right == null){
                current = current.right;
            }
            else {
                int smallValue = findSmallValue(current.right);
                System.out.println("smallValue : " + smallValue);
                current.data = smallValue;
                current.right = recursiveDeleteNode(current.right, smallValue);
            }
        }else {
            if(value <= current.data){
                current.left = recursiveDeleteNode(current.left, value);
            }
            if(value > current.data){
                current.right = recursiveDeleteNode(current.right, value);
            }
        }
        return current;
    }

    private int findSmallValue(Node root){
        return root.left == null ? root.data : findSmallValue(root.left);
    }

    private Node recursiveDFSInOrder(Node current){

        if(current != null){
            current.left = recursiveDFSInOrder(current.left);
            System.out.println(current.data);
            current.right = recursiveDFSInOrder(current.right);
        }

        return current;
    }

    private Node recursiveDFSPreOrder(Node current){

        if(current != null){
            System.out.println(current.data);
            current.left = recursiveDFSInOrder(current.left);
            current.right = recursiveDFSInOrder(current.right);
        }

        return current;
    }

    private Node recursiveDFSPostOrder(Node current){

        if(current != null){
            current.left = recursiveDFSInOrder(current.left);
            current.right = recursiveDFSInOrder(current.right);
            System.out.println(current.data);
        }

        return current;
    }


    private void recursiveBFS(Node current){


        if(current == null){
            return;
        }

        Queue<Node> nodes = new LinkedList<Node>();

        nodes.add(current);

        while(!nodes.isEmpty()){

            Node node = nodes.remove();
            System.out.println(node.data);
            if(node.left != null){
                nodes.add(node.left);
            }
            if(node.right != null){
                nodes.add(node.right);
            }

        }


    }


}

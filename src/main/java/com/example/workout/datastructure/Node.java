package com.example.workout.datastructure;

public class Node{
    private int data;
    private Node next;
    private Node before;

    public Node(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getBefore(){
        return before;
    }

    public void setBefore(Node before){
        this.before = before;
    }
}

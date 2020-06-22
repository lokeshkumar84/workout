package com.example.workout.datastructure;

public class Queue{

    private static Node head;
    private static Node tail;

    public static void addQueue(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            node.setNext(head);
            head.setBefore(node);
            head = node;
        }
        System.out.println(data + " is added to Queue");

    }

    public static void removeQueue(){
        if(tail == null){
            System.out.println("Queue is empty");
        }
        else {
            int data = tail.getData();
            tail = tail.getBefore();
            tail.setNext(null);
            System.out.println("Successfully removed: " + data);
        }
    }

    public static void peek(){
        if(head != null && tail != null){
            System.out.println("Last element: " + head.getData() + " | first element: " + tail.getData());
        }
        else {
            System.out.println("Queue is empty");
        }
    }

    public static void printQueue(){
        if(head == null){
            System.out.println("Queue is empty");
        }
        else {
            Node node = tail;
            while(node != null){
                System.out.println(node.getData());
                node = node.getBefore();
            }
        }
    }

    public static void main(String arg[]){
        printQueue();
        addQueue(1);
        addQueue(2);
        addQueue(3);
        addQueue(4);
        addQueue(5);
        addQueue(6);
        peek();
        printQueue();
        removeQueue();
        removeQueue();
        removeQueue();
        peek();
        printQueue();
    }
}

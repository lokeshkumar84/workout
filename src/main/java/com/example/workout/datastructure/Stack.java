package com.example.workout.datastructure;

public class Stack{

    private static Node head;
    private static Node tail;


    public static void pushStack(int data){

        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            head.setBefore(node);
            node.setNext(head);
            head = node;
        }
        System.out.println(data+" is added to stack...");
    }

    public static void popStack(){
        if(head == null && tail == null){
            System.out.println("Stack is empty!!!");
        }else{
            System.out.println(head.getData()+" is removed from stack...");
            head = head.getNext();
            head.setBefore(null);
        }
    }

    public static void printStack(){
        if(head == null && tail == null){
            System.out.println("Stack is empty!!!");
        }else{
          Node node = head;
          while(node != null){
              System.out.println(node.getData());
              node=node.getNext();
          }
        }
    }



    public static void main(String arg[]){
        printStack();
        pushStack(1);
        pushStack(2);
        pushStack(3);
        pushStack(4);
        pushStack(5);
        pushStack(6);
        printStack();
        popStack();
        popStack();
        popStack();
        printStack();
    }



}

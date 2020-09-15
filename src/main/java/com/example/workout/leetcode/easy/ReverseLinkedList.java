package com.example.workout.leetcode.easy;

import java.util.Stack;

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */

public class ReverseLinkedList{

    public static void main(String[] args){

        Node node = AddElement();

       /* System.out.println("Brute....");
        Node reverse = ReverseElement(node);
        while(reverse != null){
            System.out.println(reverse.data);
            reverse = reverse.next;
        }

        System.out.println("Dynamic....");
        Node reverse1 = LeetCodeReverseElement(node);
        while(reverse1 != null){
            System.out.println(reverse1.data);
            reverse1 = reverse1.next;
        }*/

        System.out.println("Recursion....");
        ReverseLinkedList reverse = new ReverseLinkedList();
        Node reverse2 = reverse.reverseUsingRecursion(node);
        while(reverse2 != null){
            System.out.println(reverse2.data);
            reverse2 = reverse2.next;
        }
    }

    public static Node left;
    public static boolean stop;

    private Node reverseUsingRecursion(Node node){

        this.left = node;
        this.stop = false;
        recursiveSwap(node);
        return node;
    }

    private void recursiveSwap(Node right){
        if(right.next == null){
            return;
        }
        right = right.next;

        recursiveSwap(right);

        if(this.left == right || right.next == left){
            stop = true;
        }
        if(!stop){
            int data = this.left.data;
            this.left.data = right.data;
            right.data = data;
        }

        this.left = this.left.next;

    }

    private static Node LeetCodeReverseElement(Node node){

        Node prev = null;
        Node curr = node;

        while(curr != null){

            Node tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;


        }

        return prev;


    }

    private static Node ReverseElement(Node node){

        Stack<Integer>  stack = new Stack<Integer>();
        while(node != null){
            stack.push(node.data);
            node = node.next;
        }
        Node head=null;
        Node temp = null;
        int size = stack.size();
        for(int i=0;i<size;i++){
            Node n = new Node(stack.pop());
            if(head == null){
                head = n;
                temp = n;

            }else{
                temp.next = n;
                temp = n;
            }
        }

        return head;
    }

    private static Node AddElement(){
        Node head=null;
        Node temp = null;
        for(int i=1;i<=5;i++){
            Node node = new Node(i);
            if(head == null){
                head = node;
                temp = node;

            }else{
                temp.next = node;
                temp = node;
            }
        }
        return head;
    }

}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

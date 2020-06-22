package com.example.workout.leetcode.easy;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

public class AddTwoNumberLinkedList{

    public static void main(String[] args){

        LinkedNode p;
        LinkedNode q;
        LinkedNode temp;
        LinkedNode traverse;

        //populating first linked list:
        p = new LinkedNode(2);
        traverse = p;
        temp = new LinkedNode(4);
        traverse.next = temp;
        traverse = temp;
        temp = new LinkedNode(9);
        traverse.next = temp;


        //populating second linked list:
        q = new LinkedNode(5);
        traverse = q;
        temp = new LinkedNode(6);
        traverse.next = temp;
        traverse = temp;
        temp = new LinkedNode(4);
        traverse.next = temp;

        //printing data to make sure it is correct.
        System.out.println("----First list----");
        temp = p;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("----second list----");
        temp = q;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("----Sum list----");

        LinkedNode sumNode = addTwoLinkedNode(p, q);
        while(sumNode != null){
            System.out.println(sumNode.data);
            sumNode = sumNode.next;
        }

    }

    private static LinkedNode addTwoLinkedNode(LinkedNode p, LinkedNode q){

        LinkedNode returnNode = null;
        LinkedNode head = null;

        int sum = 0;
        int carry = 0;
        int pData, qData;

        LinkedNode temp;


        while(p != null || q != null){

            pData = (p != null) ? p.data : 0;
            qData = (q != null) ? q.data : 0;

            sum = carry + pData + qData;

            carry = sum / 10;

            temp = new LinkedNode(sum % 10);
            if(returnNode == null){
                returnNode = temp;
                head = temp;
            }
            else {
                returnNode.next = temp;
                returnNode = temp;
            }

            if(p != null){
                p = p.next;
            }
            if(q != null){
                q = q.next;
            }
        }
        if(carry > 0){
            temp = new LinkedNode(carry);
            returnNode.next = temp;
        }
        return head;
    }
}

class LinkedNode{
    int data;
    LinkedNode next;
    LinkedNode(int data){
        this.data = data;
    }
}

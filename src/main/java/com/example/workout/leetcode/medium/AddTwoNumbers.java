package com.example.workout.leetcode.medium;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

https://leetcode.com/problems/add-two-numbers/
 */

public class AddTwoNumbers{


    public static void main(String arg[]){

        ListNode node1,temp1=null,head1 = null;
        for(int i = 1; i < 4; i++){

            node1 = new ListNode(i);
            if(head1 == null){
                head1 = node1;
                temp1 = node1;
            }else{
                temp1.next = node1;
                temp1 = node1;
            }

        }
        ListNode node2,temp2=null,head2 = null;
        for(int i = 5; i > 1; i--){

            node2 = new ListNode(9);
            if(head2 == null){
                head2 = node2;
                temp2 = node2;
            }else{
                temp2.next = node2;
                temp2 = node2;
            }

        }


        addTwoNumbers(head1, head2);

    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        /*
1 2 3
9 9 9 9
---------
0 2 3 0 1
---------

         */

        int sum = 0;
        int carry = 0;

        ListNode node = null, temp = null, head = null;

        while(l1 != null && l2 != null){

            sum = l1.val + l2.val + carry;
            node = new ListNode(sum%10);
            carry = sum/10;
            if(head == null){
                temp = node;
                head = node;
            }else{
                temp.next = node;
                temp = node;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

       while(l1 != null){
            sum = l1.val+carry;
            node = new ListNode(sum%10);
            carry = sum/10;
            if(head == null){
                temp = node;
                head = node;
            }else{
                temp.next = node;
                temp = node;
            }
            l1 = l1.next;

        }

        while(l2 != null){
            sum = l2.val+carry;
            node = new ListNode(sum%10);
            carry = sum/10;
            if(head == null){
                temp = node;
                head = node;
            }else{
                temp.next = node;
                temp = node;
            }
            l2 = l2.next;

        }
        if(carry != 0){
            node = new ListNode(carry);
            temp.next = node;
        }

        /*System.out.println("output....");
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }*/


        return head;
    }


}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

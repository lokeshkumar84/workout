package com.example.workout.leetcode.easy;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeTwoSortedLists{


    public static void main(String arg[]){

        ListNode l1 = populateSortedList(1); //1 -> 2 -> 3
        ListNode l2 = populateSortedList(2);// 2 -> 3 -> 4


        ListNode output = mergeTwoLists(l1, l2); //1 -> 2 -> 2 -> 3 -> 3 -> 4


        while(output != null){
            if(output.val > 0){
                System.out.println(output.val);
            }
            output = output.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = null;
        if(l1 == null){
            result = l2;
        }
        if( l2 == null){
            result = l2;
        }

        ListNode temp = new ListNode(-1);
        result = temp;

        while( l1 != null && l2 != null){

            if(l1.val <= l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

            if(l1 != null){
                temp.next = l1;
            }
            if(l2 != null){
                temp.next = l2;
            }

        return result;

    }

    private static ListNode populateSortedList(int n){
        ListNode l1 = null;
        ListNode head = null;
        ListNode rear = null;
        for(int i=n;i<=n+2;i++){
            l1 = new ListNode(i);
            if(head == null){
                head = l1;
                rear = l1;
            }else{
                rear.next = l1;
                rear = l1;
            }
        }
        return head;
    }
}



//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

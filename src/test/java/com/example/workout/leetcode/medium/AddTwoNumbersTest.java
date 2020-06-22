package com.example.workout.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest{

    ListNode node1=null,temp1=null,head1 = null;
    ListNode node2=null,temp2=null,head2 = null;

    @Test void addTwoNumbers_withoutCarry(){

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

        for(int i = 4; i > 1; i--){
            node2 = new ListNode(9);
            if(head2 == null){
                head2 = node2;
                temp2 = node2;
            }else{
                temp2.next = node2;
                temp2 = node2;
            }
        }

        /*
        1 2 3
        4 3 2
        -----
        5 5 5
        -----
         */

        ListNode out = AddTwoNumbers.addTwoNumbers(node1, node2);
        while(out != null){
            assertEquals(5,out.val);
            out = out.next;
        }



    }
}

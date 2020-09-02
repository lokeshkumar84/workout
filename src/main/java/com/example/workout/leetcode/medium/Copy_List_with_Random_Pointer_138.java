package com.example.workout.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

The Linked List is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:

val: an integer representing Node.val
random_index: the index of the node (range from 0 to n-1) where random pointer points to, or null if it does not point to any node.

Ex: 1
Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]

Ex: 2
Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]

Ex: 3
Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]

Ex: 4
Input: head = []
Output: []
Explanation: Given linked list is empty (null pointer), so return null.

 */
public class Copy_List_with_Random_Pointer_138 {


  public static void main(String args[]){

    Node copy = copyRandomList(assembleNode());
    while(copy != null){
      System.out.println(copy.val);
      copy = copy.next;
    }

  }


  static Map<Node, Node> visitedNode = new HashMap<>();

  public static Node copyRandomList(Node head) {

    Node oldNode = head;
    Node newNode = new Node(oldNode.val);

    visitedNode.put(oldNode,newNode);

    while(oldNode != null){

      newNode.next = getClonedNode(oldNode.next);
      newNode.random = getClonedNode(oldNode.random);

      oldNode = oldNode.next;
      newNode = newNode.next;
    }
    return visitedNode.get(head);
  }

  private static Node getClonedNode(Node node) {
    if(node != null){
      return visitedNode.getOrDefault(node,new Node(node.val));
    }
    return null;
  }

  private static Node assembleNode(){
    Node node1 =new Node(1);
    Node node2 = new Node(2);
    Node head = node1;
    node1.next = node2;
    node1.random = node2;

    node2.next = null;
    node2.random = node2;

    return head;
  }


  static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }


}



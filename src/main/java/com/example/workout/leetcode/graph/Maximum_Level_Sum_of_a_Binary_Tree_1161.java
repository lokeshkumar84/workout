package com.example.workout.leetcode.graph;
/*
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level X such that the sum of all the values of nodes at level X is maximal.

Example 1:

Input: [1,7,0,7,-8,null,null]
Output: 2
Explanation:
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.
 */


import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Level_Sum_of_a_Binary_Tree_1161{

    static TreeNode root;

    public static void main(String s[]){

        root = addNode(5, root);
        root = addNode(3, root);
        root = addNode(8, root);
        root = addNode(2, root);
        root = addNode(4,root);
        root = addNode(6,root);
        root = addNode(9,root);

        System.out.println("Level of max sum is: " +maxSumLevel(root));

        BFS(root);

    }



    public static int maxSumLevel(TreeNode root){

        if(root == null){
            System.out.println("Tree is empty");
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        int maxSum = 0, level = 1,localLevel = 1, localSum = 0;

        queue.offer(root);
        //null is the delimitor.
        queue.offer(null);

        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            if(node == null){
                //to avoind infinite loop;
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
                if(maxSum < localSum){
                    maxSum = localSum;
                    level = localLevel;
                }
                localSum = 0;
                localLevel++;


            }else{
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                localSum += node.val;
            }
        }
        return level;
    }





    private static void BFS(TreeNode root){


        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.println(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }

    }


    private static TreeNode addNode(int data, TreeNode root){

        if(root == null){
            return new TreeNode(data);
        }else {
            if(data <= root.val){
                root.left=addNode(data,root.left);
            }else{
                root.right=addNode(data,root.right);
            }
        }
        return root;
    }

}






//TREE Node class
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) {
          this.val = val;
      }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

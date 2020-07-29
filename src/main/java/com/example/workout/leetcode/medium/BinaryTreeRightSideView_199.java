package com.example.workout.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView_199{

    public static void main(String[] args){

        /*TreeNode root;
        for(int i=0;i<5;i++){

        }

        rightSideView(root)
        */

    }

    private static List<Integer> rightSideView(TreeNode root) {


        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int size = queue.size();
            for(int i=0;i<size;i++){

                TreeNode current = queue.poll();

                if(i==0){
                    result.add(current.val);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
                if(current.left != null){
                    queue.offer(current.left);
                }

            }


        }

        return result;


    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

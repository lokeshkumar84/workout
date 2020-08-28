package com.example.workout.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a collection of distinct integers, return all possible permutations.
Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
https://www.youtube.com/watch?v=idmgLLNIC2U
 */
public class Permutations_46 {

  public static void main(String arg[]) {
    permute(new int[]{1, 2, 3}).forEach((i) -> {
      System.out.println("--------------");
      i.forEach((x) -> System.out.println(x));
    });
  }


  private static List<List<Integer>> permute(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();

    if (nums == null || nums.length == 0) {
      return result;
    }

    boolean[] used = new boolean[nums.length];
    List<Integer> permutations = new ArrayList<>();

    helper(nums,permutations,used,result);
    return result;
  }

  private static void helper(int[] nums,List<Integer> permutation, boolean[] used, List<List<Integer>> result){

    if(permutation.size() == nums.length){
      result.add(new ArrayList<>(permutation));
    }
    for(int i=0;i<nums.length;i++){
      if(used[i]){
        continue;
      }
      used[i] = true;
      permutation.add(nums[i]);
      helper(nums,permutation,used,result);
      used[i]=false;
      permutation.remove(permutation.size()-1);
    }
  }
}

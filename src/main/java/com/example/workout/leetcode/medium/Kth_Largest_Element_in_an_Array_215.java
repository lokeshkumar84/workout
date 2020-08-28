package com.example.workout.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;

/*
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class Kth_Largest_Element_in_an_Array_215 {


  public static void main(String[] args) {
    int[] nums = {3,2,3,1,2,4,5,5,6};
    //{3,2,1,5,6,4};
    System.out.println(findKthLargest(nums,10));
  }

  private static int findKthLargest(int[] nums, int k) {
    if(nums.length == 0 || nums == null){
      return -1;
    }
    Arrays.sort(nums);
    for(int i= nums.length-1,j=1; i>=0;i--,j++){
      if(j == k){
        return nums[i];
      }
    }
    return -1;
  }

}

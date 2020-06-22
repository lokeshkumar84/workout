package com.example.workout.leetcode.easy;

/*
Given an array nums, write a function to move all 0's to the end of it
while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class MoveZeroes{

    public static void main(String[] args){

        int[] nums = {0,1,0,4,2};
        moveZeroes(nums);

    }

        public static void moveZeroes(int[] nums) {

            int index=0;
            for(int i=0;i<nums.length ;i++){
                if(nums[i] != 0){
                    nums[index++] = nums[i];
                }
            }
            for(int i=index; i<nums.length;i++){
                nums[i] = 0;
            }

            for(int i:nums){
                System.out.println(i);
            }

        }
}

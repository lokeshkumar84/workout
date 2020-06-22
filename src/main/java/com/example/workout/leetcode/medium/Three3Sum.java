package com.example.workout.leetcode.medium;
/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three3Sum{

    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }



    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return result;
        }

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){

            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){

                int left = i+1;
                int right = nums.length-1;
                int sum = 0 - nums[i];

                while(left < right){

                    if(nums[left]+nums[right] == sum){

                        System.out.println(nums[i]+""+nums[left]+""+nums[right]);
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));


                        while(left < right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(nums[left] + nums[right] > sum){
                        right--;
                    }else{
                        left++;
                    }
                }

            }


        }
        return result;
    }
}

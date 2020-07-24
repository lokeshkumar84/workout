package com.example.workout.leetcode.medium;
/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

    Note: You may not slant the container and n is at least 2.
*/
public class ContainerWithMostWater_11 {

  public static void main(String[] args) {
    System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  }

  public static int maxArea(int[] height) {

    int maxArea = Integer.MIN_VALUE;
    int i=0;
    int j=height.length-1;

    while( i<j){
      int minLength = Math.min(height[i],height[j]);
      int maxbreadth = j-i;
      maxArea = Math.max(maxArea,minLength*maxbreadth);
      if(height[i]<height[j]){
        i++;
      }else{
        j--;
      }
    }

    return maxArea;
  }

}

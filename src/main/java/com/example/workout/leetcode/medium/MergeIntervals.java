package com.example.workout.leetcode.medium;

/*
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */

import java.util.*;

public class MergeIntervals{

    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{4,7},{8,10},{15,18}};
        merge(intervals);
    }


    public static int[][] merge(int[][] intervals) {


        Arrays.sort(intervals,(array1, array2) -> Integer.compare(array1[0],array2[0]));

        List<int[]> output_arr = new ArrayList<>();

        int[] current_arr = intervals[0];
        output_arr.add(current_arr);

        for(int[] interval: intervals){

            int current_begin = current_arr[0];
            int current_end = current_arr[1];

            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end >= next_begin ){
                current_arr[1] = Math.max(current_end,next_end);
            }else{
                current_arr=interval;
                output_arr.add(current_arr);
            }
        }

        output_arr.forEach((arr)-> System.out.println(arr[0]+" "+arr[1]));
        return output_arr.toArray(new int[output_arr.size()][]);

    }
}

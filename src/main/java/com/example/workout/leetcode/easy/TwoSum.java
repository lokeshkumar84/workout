package com.example.workout.leetcode.easy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class TwoSum{

    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19, 42,100};
        int sum = 142;

        usingArray(array,sum);
        usingHashMap(array,sum);

    }

    private static void usingHashMap(int[] array, int sum){


        Date startDate = new Date();
        int result[] = findWithHashMap(array, sum);
        Date endDate = new Date();

        for(int i = 0; i < result.length; i++){
            if(result[i] != -1){
                System.out.println(result[i]);
            }
        }
        System.out.println("Total time using hashmap: " + (endDate.getTime() - startDate.getTime()));
    }


    private static int[] findWithHashMap(int[] array,int sum){

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<array.length;i++){
            int diff = sum - array[i];
            if(!map.isEmpty() && map.containsKey(diff)){
                int[] result = {map.get(diff),i};
                return result;
            }else{
                map.put(array[i],i);
            }
        }

        int[] k = {-1,-1};
        return k;

    }

    private static void usingArray(int[] array, int sum){


        Date startDate = new Date();
        int result[] = traditionMethod(array, sum);
        Date endDate = new Date();

        for(int i = 0; i < result.length; i++){
            if(result[i] != -1){
                System.out.println(result[i]);
            }
        }
        System.out.println("Total time using Array: " + (endDate.getTime() - startDate.getTime()));
    }




    private static int[] traditionMethod(int[] array,int sum){

        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if((array[i] + array[j]) == sum){
                    int[] result = {array[i], array[j]};
                    return result;
                }
            }
        }
        int[] k = {-1,-1};
        return k;

    }
}

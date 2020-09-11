package com.example.workout.leetcode.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Top_k_frequent_elements_347 {

    public static void main(String args[]){

        int[] nums = {1,1,1,2,2,2,3,3,3,3};
        int[] result = topKFrequent(nums,2);
        for(int i:result){
            System.out.println(i);
        }

    }
    private static int[] topKFrequent(int[] nums, int k) {

        int[] result = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1,e2) -> (int) (e2.getValue() - e1.getValue())).limit(k)
                .map(x -> x.getKey())
                .mapToInt(x -> x).toArray();
        return result;
    }

}

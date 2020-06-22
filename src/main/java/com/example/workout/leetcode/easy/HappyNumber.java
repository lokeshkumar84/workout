package com.example.workout.leetcode.easy;

/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.

Example:

Input: 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

import java.util.HashSet;
import java.util.Set;

public class HappyNumber{

    private static Set<Integer> cycleRefer = new HashSet<Integer>();

    private static boolean isHappyNumber=true;

    public static void main(String[] args){

        isHappyNumber(116);

        if(isHappyNumber){
            System.out.println(" happy number... ");
        }else{
            System.out.println(" Not happy number... ");
        }

    }

    private static int totalSum(int n){
        int totalSum = 0;

        while(n > 0){

            int d = n%10;
            n = n/10;

            totalSum += d*d;

        }

        return totalSum;
    }



    private static void isHappyNumber(int num){

        int sum = totalSum(num);

        if(sum != 1){
            if(cycleRefer.contains(sum)){
                cycleRefer.forEach((v)-> System.out.println(v));
                System.out.println(sum);
                isHappyNumber=false;
            }else{
                cycleRefer.add(sum);
                isHappyNumber(sum);
            }
        }
    }

}

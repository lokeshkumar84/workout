package com.example.workout.leetcode.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 */

public class ReverseInteger{

    public static void main(String[] args){
        int i = 1234;
        System.out.println(reverseInteger(i));
    }

    private static int reverseInteger(int i){
        int rev = 0;
        int pop;
        try{
            while(i != 0){
                pop = i % 10;
                i = i / 10;
                rev = rev * 10 + pop;
            }
        }catch(NumberFormatException e){
            rev = 0;
        }
        return rev;
    }
}

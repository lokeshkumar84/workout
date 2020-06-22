package com.example.workout.leetcode.easy;

/*
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */

public class AddBinary{

    public static void main(String[] args){

        System.out.println(addBinaryByLibrary("11","11"));

    }

    private static String addBinaryByLibrary(String a, String b) {

        //Radix: Radix is a term used to describe the number of digits
        // utilized in a positional number system before "rolling over" to the next digit's place. ...
        // In the base 2 number system, there are two numbers used (zero and one), so its radix is two.
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));

    }

}

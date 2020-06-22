package com.example.workout.leetcode.easy;

/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

public class AddStrings{

    public static void main(String[] args){

        String num1 = "119";
        String num2 = "11";

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carryover = 0, sum;

        StringBuffer sb = new StringBuffer();

        while(i >= 0 && j >= 0){
            sum = carryover;
            sum += (num1.charAt(i--)-'0') + (num2.charAt(j--) - '0');
            sb.append(sum%10);
            carryover = sum/10;
        }

        if(i >= 0){
            sum = carryover;
            sum += num1.charAt(i--) - '0';
            sb.append(sum%10);
            carryover = sum/10;
        }

        if(j >= 0){
            sum = carryover;
            sum += num2.charAt(j--) - '0';
            sb.append(sum%10);
            carryover = sum/10;
        }

        if(carryover > 0){
            sb.append(carryover);
        }

        System.out.println(sb.reverse().toString());

    }
}

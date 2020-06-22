package com.example.workout.leetcode.easy;

public class ValidPalindromeInteger{

    public static void main(String[] args){
        System.out.println(isPalindrome(-121));
    }


    public static boolean isPalindrome(int x) {


        boolean isPalindrome = false;
        int temp = x;

        int reverse=0;
        while(x>0){
            reverse = (reverse*10)+(x%10);
            x = x/10;
        }

        if(temp - reverse == 0){
            isPalindrome = true;
        }
        return isPalindrome;
    }
}

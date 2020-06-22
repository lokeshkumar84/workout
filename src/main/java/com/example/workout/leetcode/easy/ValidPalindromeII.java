package com.example.workout.leetcode.easy;
/*
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
 */

public class ValidPalindromeII{


    public static void main(String[] args){
        System.out.println(validPalindrome("abbassaac"));
    }

    private static boolean validPalindrome(String s) {

        boolean isPalindrome = false;

        StringBuffer sb = new StringBuffer(s);

        if(s.equalsIgnoreCase(sb.reverse().toString())){
            return true;
        }else{
            int size = sb.length();
            for(int i=0;i<size;i++){
                sb = new StringBuffer(s);
                sb.deleteCharAt(i);
                if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
                    return true;
                }

            }
        }

        return isPalindrome;

    }

}

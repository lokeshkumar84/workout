package com.example.workout.leetcode.medium;

/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */

public class LongestPalindromicSubstring{


    public static void main(String[] args){
        System.out.println(longestPalindrome("abbbd"));
    }

    public static String longestPalindrome(String s) {

        String output = "";
        int[] result;
        int out = 0;
        for(int i=0; i<s.length();i++){

            result = checkPalindrome(s,i,i);
            if(s.substring(result[0],result[1]).length() > output.length()){
                output = s.substring(result[0],result[1]);
            }
            result = checkPalindrome(s,i,i+1);
            if(s.substring(result[0],result[1]).length() > output.length()){
                output = s.substring(result[0],result[1]);
            }

        }

        return output;


    }

    private static int[] checkPalindrome(String s, int i, int j){

        while( i >= 0 && i <= s.length()-1 && j <= s.length()-1 && j >= 0 && s.charAt(i) == s.charAt(j) ){
            i--;
            j++;
        }

        int[] result = {i+1,j};
        return result;
    }



}

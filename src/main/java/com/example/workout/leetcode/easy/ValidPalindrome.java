package com.example.workout.leetcode.easy;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
public class ValidPalindrome{

    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        StringBuffer sb = new StringBuffer();
        for(char c:str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Yes Palindrome");
        }else{
            System.out.println("not Palindrome");
        }

    }
}

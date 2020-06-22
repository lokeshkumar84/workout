package com.example.workout.leetcode.medium;
/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters{

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


    static int lengthOfLongestSubstring(String s) {

        HashSet<Character> output = new HashSet<Character>();
        int maximum = 0, i=0,j=0;
        while(j < s.length()){

            if(!output.contains(s.charAt(j))){
                output.add(s.charAt(j));
            }else{
                maximum = Math.max(output.size(),maximum);
                output.remove(s.charAt(i));
            }
            j++;

        }
        return maximum;
    }
}

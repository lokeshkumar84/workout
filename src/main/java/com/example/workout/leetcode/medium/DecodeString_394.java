package com.example.workout.leetcode.medium;
/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
For example, there won't be input like 3a or 2[4].

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"

Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"

Example 3:
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"

Example 4:
Input: s = "abc3[cd]xyz"
Output: "abccdcdcdxyz"

https://www.youtube.com/watch?v=0iQqj5egK9k
 */

import java.util.Stack;

public class DecodeString_394{

    public static void main(String[] args){
        //System.out.println("aaabcbc".equals(decodeString("3[a]2[bc]")));
        System.out.println("accaccacc".equals(decodeString("3[a2[c]]")));
       // System.out.println(decodeString("abc33[a]2[bc]"));
    }


    private static String decodeString(String s) {

        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        String res ="";
        int index = 0;

        while(index < s.length()){

            //abc33[a]2[bc]

            if(Character.isDigit(s.charAt(index))){

                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);

            }else if(s.charAt(index) == '['){
                result.push(res);
                res = "";
                index++;

            }else if(s.charAt(index) == ']'){

                StringBuilder sb = new StringBuilder(result.pop());
                int count = counts.pop();
                for(int i=0;i<count;i++){
                    sb.append(res);
                }

                res = sb.toString();
                index++;

            }else{
                res += s.charAt(index);
                index++;
            }

        }
        return res;
    }
}

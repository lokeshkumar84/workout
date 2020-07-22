package com.example.workout.leetcode.medium;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses_22{

    public static void main(String[] args){
        generateParenthesis(2).forEach(System.out::println);
    }

    public static List<String> generateParenthesis(int n) {

        List<String> output = new ArrayList<String>();
        backtrack(output,"",n,n);
        return output;

    }

    private static void backtrack(List<String> output, String curr, int left, int right){

        if(left < 0 || left > right){
            return;
        }

        if(left == 0 && right == 0){
            output.add(curr);
            return;
        }

        backtrack(output,curr+"(",left-1,right);
        backtrack(output,curr+")",left,right-1);

    }
}

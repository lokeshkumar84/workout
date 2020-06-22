package com.example.workout.leetcode.easy;

import java.util.Stack;


public class ValidParenthesis{


    private static String open_Tokens = "{[(";
    private static String closed_tokens = "}])";

    public static void main(String[] args){

        String s = "{[{}{}][]}";
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for(char c: chars){
            if(openParam(c)){
                stack.push(c);
            }else{
                if(!stack.empty()){

                    if(matches(stack.peek(),c)){
                        stack.pop();
                    }
                }else{
                    stack.push(c);
                }
            }
        }

        if(stack.empty()){
            System.out.println("Paranthesis matched...");
        }else{
            System.out.println("Nope.. Paranthesis are not matched");
        }
    }

    private static boolean matches(char open,char close ){

        char[] openTokens = open_Tokens.toCharArray();
        char[] closedTokens = closed_tokens.toCharArray();

        for(int i=0; i<openTokens.length;i++){
            if(openTokens[i] == open){
                if(closedTokens[i] == close){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean openParam(char c){

        char[] tokens = open_Tokens.toCharArray();
        for(char token:tokens){
            if(token == c){
                return true;
            }
        }
        return false;
    }

}

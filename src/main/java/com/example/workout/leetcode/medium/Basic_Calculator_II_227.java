package com.example.workout.leetcode.medium;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Implement a basic calculator to evaluate a simple expression string.

The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.

Example 1:

Input: "3+2*2"
Output: 7
Example 2:

Input: " 3/2 "
Output: 1
Example 3:

Input: " 3+5 / 2 "
Output: 5
Note:

You may assume that the given expression is always valid.
Do not use the eval built-in library function.
 */
public class Basic_Calculator_II_227 {

    public static void main(String arg[]){

        System.out.println(calculate("3-2*2") == 7);


    }


    public static int calculate(String s) {

        //s = 3 + 2 * 2;
        int answer = 0;
        List<Integer> numbers = getNumbers(s);
        List<Character> operators = getOperators(s);
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(numbers.get(0));

        int num_index = 1, op_index=0;

        while( num_index < numbers.size() && op_index < operators.size()){

            if(operators.get(op_index) == '+'){
                stack.push(numbers.get(num_index));
            }else if(operators.get(op_index) == '-'){
                stack.push(numbers.get(num_index)*-1);
            }else if(operators.get(op_index) == '*'){
                stack.push(stack.pop() * numbers.get(num_index));
            }else if(operators.get(op_index) == '/'){
                stack.push(stack.pop() / numbers.get(num_index));
            }

            num_index++;
            op_index++;
        }

        while (!stack.empty()){
            answer += stack.pop();
        }
        return answer;
    }

    private static List<Integer> getNumbers(String str){

        List<Integer> numbersList = new ArrayList<>();
        String[] numbers = str.split("\\+|\\-|\\*|\\/");
        for(String s:numbers){
            numbersList.add(Integer.valueOf(s));
        }
        return numbersList;
    }

    private static List<Character> getOperators(String str){

        List<Character> operatorList = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
                operatorList.add(str.charAt(i));
            }
        }
        return operatorList;
    }

}

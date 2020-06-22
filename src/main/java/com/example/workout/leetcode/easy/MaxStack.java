package com.example.workout.leetcode.easy;

import java.util.Stack;

public class MaxStack{

    public static void main(String[] args){
        MyMinStack stack = new MyMinStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        System.out.println(stack.top()); //-> 5
        System.out.println(stack.popMax()); //-> 5
        System.out.println(stack.top()); //-> 1
        System.out.println(stack.peekMax()); //-> 5
        System.out.println(stack.pop()); //-> 1
        System.out.println(stack.top()); //-> 5
    }


}

class MyMinStack {


    Stack<int[]> stack = new Stack<int[]>();

    public MyMinStack() {

    }

    public void push(int x) {

        int[] element={x,x};
        if(stack.size() != 0){
            if(stack.peek()[1] > x){
                element[1]=stack.peek()[1];
            }
        }

        stack.push(element);

    }

    public int pop() {

        return stack.pop()[0];
    }

    public int top() {

        return stack.peek()[0];
    }

    public int peekMax() {

        return stack.peek()[1];

    }

    public int popMax() {
        return stack.pop()[1];
    }
}


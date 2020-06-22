package com.example.workout.leetcode.easy;
/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */


import java.util.Stack;

class MinStack{
    public static void main(String[] args){

        MyStack obj = new MyStack();
        obj.push(-2);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.pop();
        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());


        System.out.println("-------");

        LeetCodeStack obj1 = new LeetCodeStack();
        obj1.push(-2);
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.pop();
        System.out.println(obj1.top());
        obj1.pop();
        System.out.println(obj1.top());
        System.out.println(obj1.getMin());

    }
}



class LeetCodeStack{

    Stack<int[]> stack = new Stack<int[]>();

    LeetCodeStack(){

    }

    protected void push(int x){

        if(stack.isEmpty()){
            stack.push(new int[]{x,x});
            return;
        }

        int minVaule = stack.peek()[1];
        stack.push(new int[]{x,Math.min(x,minVaule)});

    }

    protected void pop(){
        stack.pop();
    }

    protected int top(){
        return stack.peek()[0];
    }

    protected int getMin(){
        return stack.peek()[1];
    }


}





class MyStack{

    Stack<Integer> stack = new Stack<Integer>();

    MyStack(){

    }

    protected void push(int x){
        stack.push(x);
    }

    protected void pop(){
        stack.pop();
    }

    protected int top(){

        return stack.peek();
    }

    protected int getMin(){
        int i=0;
        int min = Integer.MAX_VALUE;
        while(i < stack.size() ){
            min = Integer.min(min,stack.get(i));
            i++;
        }
        return min;
    }

}

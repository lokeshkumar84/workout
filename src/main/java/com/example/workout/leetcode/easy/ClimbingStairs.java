package com.example.workout.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs{

    public static void main(String[] args){

        System.out.println("climbStairs1: "+climbStairs1(10));
        System.out.println("climbStairs_fib: "+climbStairs_fib(10));
        System.out.println("climbStairs_dynamicProgramming: "+climbStairs_dynamicProgramming(10));

    }

    private static int climbStairs_dynamicProgramming(int n){

        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        if(n == 1){
            return 1;
        }
        if( n ==2 ){
            return 2;
        }
        if(temp.containsKey(n)){
            return temp.get(n);
        }else{
            return climbStairs_dynamicProgramming(n -1 ) + climbStairs_dynamicProgramming(n-2);
        }

    }

    private static int climbStairs_fib(int n){
        if(n == 1){
            return 1;
        }
        if( n ==2 ){
            return 2;
        }
        return climbStairs_fib(n-1) + climbStairs_fib(n-2);
    }

    private static int climbStairs1(int n){

        int[] temp = new int[n+1];

        temp[1] = 1;
        temp[2] = 2;

        for(int i =3;i<=n;i++){
            temp[i] = temp[i-1]+temp[i-2];
        }

        return temp[n];

    }

}

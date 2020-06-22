package com.example.workout.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FibTest{

    public static void main(String ar[]){

        System.out.println(fib(5));
        //0 1 1 2 3 5 8
    }

    public static int fib(int n){


        List<Integer> fibList = new ArrayList<Integer>();

        fibList.add(0);
        fibList.add(1);
        int sum = 0;
        for(int i=2; i<=n; i++){

            sum = sum + fibList.get(i-1);
            fibList.add(sum);
        }

        return sum;

    }
}

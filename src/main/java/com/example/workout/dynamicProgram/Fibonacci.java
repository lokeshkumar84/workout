package com.example.workout.dynamicProgram;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Fibonacci{

    public static Map<Integer,Integer> fibCache;

    public static void main(String[] args){

        int n = 2;

        Date startTime = new Date();
        memorizedArray(n);
        System.out.println(fib(n));
        Date endTime = new Date();

        System.out.println("Total time With Memorization: " + (endTime.getTime() - startTime.getTime()));


        Date start = new Date();
        System.out.println(fibWithOutMemorized(n));
        Date end = new Date();
        System.out.println("Total time With out Memorization: " + (end.getTime() - start.getTime()));

        System.out.println("----------------- Print series ------------");
        fibCache.forEach((k,v)-> System.out.println(k+"|"+v));

    }


    private static void memorizedArray(int n){

        fibCache = new HashMap<Integer, Integer>();

        for(int i=0 ; i<=n; i++ ){

            if(i<=1){
                fibCache.put(i,i);
            }else{
                fibCache.put(i,fib(i));
            }
        }
    }

    private static int fib(int n){

        if(fibCache.containsKey(n)){
            return fibCache.get(n);
        }else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    private static int fibWithOutMemorized(int n){
        if(n<=1){
            return n;
        }else{
            return fibWithOutMemorized(n-1) + fibWithOutMemorized(n-2);
        }
    }


}

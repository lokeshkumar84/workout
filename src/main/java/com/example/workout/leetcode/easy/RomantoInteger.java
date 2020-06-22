package com.example.workout.leetcode.easy;
/*
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 */

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger{

    private static Map<Character,Integer> values = new HashMap<Character, Integer>();

    public static void main(String[] args){

        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);

        System.out.println(romanToInt("XXIV"));

    }

    public static int romanToInt(String s) {

        int result=0;

        for(int i = 0; i<s.length();i++){

            if(i > 0  && values.get(s.charAt(i)) > values.get(s.charAt(i-1)) ){
                result += values.get(s.charAt(i)) - (2 * values.get(s.charAt(i-1)));
            }else {
                result += values.get(s.charAt(i));
            }
        }
        return result;

    }
}

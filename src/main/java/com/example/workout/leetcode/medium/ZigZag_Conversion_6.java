package com.example.workout.leetcode.medium;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I

https://www.youtube.com/watch?v=LbNLY6Ajs6s

 */

import java.util.HashMap;
import java.util.Map;

public class ZigZag_Conversion_6 {

  public static void main(String arg[]){
    System.out.println(convert("PAYPALISHIRING",4).equalsIgnoreCase("PINALSIGYAHRPI"));
  }

  public static String convert(String s, int numRows) {

    Map<Integer,StringBuilder> mapper = new HashMap<>();

    boolean increment = true;
    int pos = 0;

    for(char c: s.toCharArray()){

      if(pos == numRows){
        increment = false;
      }
      if(pos == 1){
        increment = true;
      }

      if(increment){
        pos++;
      }else{
        pos--;
      }

      mapper.putIfAbsent(pos,new StringBuilder());
      mapper.get(pos).append(c);


    }

    StringBuilder result = new StringBuilder();
    mapper.forEach((k,v) -> result.append(v));
    return result.toString();

  }



}

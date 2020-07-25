package com.example.workout.leetcode.medium;
/*
A string S of lowercase English letters is given.
We want to partition this string into as many parts as possible so that each letter appears in at most one part,
and return a list of integers representing the size of these parts.

Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.


Note:

S will have length in range [1, 500].
S will consist of lowercase English letters ('a' to 'z') only.
 */

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763{


    public static void main(String[] args){

        String S = "ababcbacadefegdehijhklij";
        partitionLabels(S).forEach(System.out::println);
    }

    public static List<Integer> partitionLabels(String S){

        int[] maxSize = new int[26];
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < S.length(); i++){
            maxSize[S.charAt(i) - 'a'] = i;
        }

        int start = 0;
        int end = 0;
        for(int i=0; i<S.length();i++){
            end = Math.max(end,maxSize[S.charAt(i)-'a']);
            if(i == end){
                result.add(end-start+1);
                start = end+1;
            }
        }
        return result;
    }
}

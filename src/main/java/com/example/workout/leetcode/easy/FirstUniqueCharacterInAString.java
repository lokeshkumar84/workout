package com.example.workout.leetcode.easy;

import java.util.LinkedHashMap;

public class FirstUniqueCharacterInAString{

    public static void main(String[] args){
        System.out.println(firstUniqChar("lokeshloesk"));
    }

    private static int firstUniqChar(String str){

        LinkedHashMap<Character,Integer> countMap =  new LinkedHashMap<Character, Integer>();

        for(Character ch:str.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<str.length();i++){
            if(countMap.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

}

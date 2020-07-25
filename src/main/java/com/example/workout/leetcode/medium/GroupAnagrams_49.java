package com.example.workout.leetcode.medium;
/*
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */

import java.util.*;

public class GroupAnagrams_49{

    public static void main(String[] args){
        String[] inputs = {"eat", "tea", "tan", "ate", "nat", "bat", "meena","eenam","eneam","aneem"};
        groupAnagrams(inputs).forEach((i) -> {
            System.out.println("---------------");
            i.forEach(System.out::println);
        });
        System.out.println("---------------");
    }

    private static List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0){
            return null;
        }

        Map<String,List<String>> anagramMap = new HashMap<String,List<String>>();

        for(int i=0;i<strs.length;i++){
            char[] characters = strs[i].toCharArray();
            Arrays.sort(characters);
            String sortedStr = new String(characters);

            if(!anagramMap.containsKey(sortedStr)){
                anagramMap.put(sortedStr,new ArrayList());
            }
            anagramMap.get(sortedStr).add(strs[i]);
        }

        //return new ArrayList<>(anagramMap.values());
        List<List<String>> result = new ArrayList<List<String>>();
        result.addAll(anagramMap.values());
        return result;
    }
}

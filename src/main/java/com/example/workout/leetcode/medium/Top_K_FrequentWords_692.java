package com.example.workout.leetcode.medium;
/*
Given a non-empty list of words, return the k most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

Example 1:
Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
Output: ["i", "love"]
Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:
Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
Output: ["the", "is", "sunny", "day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.
 */

import java.util.*;

public class Top_K_FrequentWords_692{

    public static void main(String[] args){
        String[] str = {"i", "love", "leetcode", "i", "love", "coding"};
            //{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
            //
        topKFrequent(str,2).forEach(System.out::println);
    }

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> resultMap = new HashMap<String, Integer>();

        for(String s:words){
            resultMap.put(s,resultMap.getOrDefault(s,0)+1);
        }

        List<String> candidates = new ArrayList(resultMap.keySet());
        //Now candidates has all the required value

        Collections.sort(candidates, (w1,w2) -> resultMap.get(w1).equals(resultMap.get(w2))?
            w1.compareTo(w2):resultMap.get(w2)-resultMap.get(w1));

        return candidates.subList(0,k);


    }
}

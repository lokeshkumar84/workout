package com.example.workout.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.
Words in the paragraph are not case sensitive.  The answer is in lowercase.



Example:

Input:
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"),
and that "hit" isn't the answer even though it occurs more because it is banned.
 */
public class MostCommonWord{

    public static void main(String[] args){

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit","ball"};

        System.out.println(mostCommonWord(paragraph,banned));

    }

    private static String mostCommonWord(String paragraph, String[] banned) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        StringBuffer sb = new StringBuffer();

        String result="";
        int max = 0;

        Set<String> bannedStr = new HashSet<String>();

        for(String str:banned){
            bannedStr.add(str.toLowerCase());
        }

        for(char c:paragraph.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
            }else if(sb.length() > 0){

                String word = sb.toString().toLowerCase();

                if(!bannedStr.contains(word)){
                    map.put(word,map.getOrDefault(word,0)+1);
                }
                if(map.getOrDefault(word,0) > max){
                    result = word;
                    max = map.get(word);
                }

                sb = new StringBuffer();


            }
        }


        return result;

    }
}

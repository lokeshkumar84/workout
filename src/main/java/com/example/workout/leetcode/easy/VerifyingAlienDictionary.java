package com.example.workout.leetcode.easy;

/**
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order.
 * The order of the alphabet is some permutation of lowercase letters.
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet,
 * return true if and only if the given words are sorted lexicographicaly in this alien language.
 *
 * Example 1:
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 *
 * Example 2:
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
 *
 * Example 3:
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.)
 * According to lexicographical rules "apple" > "app", because 'l' > '∅',
 * where '∅' is defined as the blank character which is less than any other character (More info).
 */

public class VerifyingAlienDictionary{

    public static void main(String arg[]){

        String[] word = {"word","word"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        System.out.println(isAlienSorted(word,order));

    }

    public static int[] char_map;
    public static boolean isAlienSorted(String[] word, String order) {

        char_map = new int[26];
        for(int i=0 ; i<order.length();i++){
            char_map[order.charAt(i) - 'a'] = i;

        }
/*
        for(int i=0 ; i<order.length();i++){
            System.out.println(char_map[i]);

        }*/

        for(int i=1;i<word.length;i++){
            if(compare(word[i-1],word[i]) > 0){
                return false;
            }
        }
        return true;
    }

    private static int compare(String word1, String word2){

        int i=0;
        int j=0;
        int compare_val = 0;

        while(i < word1.length() && j < word2.length() && compare_val == 0){

            compare_val = char_map[word1.charAt(i)-'a'] - char_map[word2.charAt(j)-'a'];

            i++;
            j++;
        }

        if(compare_val == 0){
            return word1.length() - word2.length();
        }else{
            return compare_val;
        }
    }
}

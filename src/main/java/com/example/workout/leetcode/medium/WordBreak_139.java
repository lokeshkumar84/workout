package com.example.workout.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak_139 {

  public static void main(String[] args) {
    System.out.println(wordBreak("leetcode", Arrays.asList("leet","co","de")));
  }


  public static boolean wordBreak(String s, List<String> wordDict) {

    Set<String> words = new HashSet<String>(wordDict);

    boolean[] dp = new boolean[s.length()+1];

    dp[0] = true;

    for(int i=1; i<= s.length(); i++){
      for(int j=0;j<i;j++){

        if(dp[j] && words.contains(s.substring(j, i))){
          dp[i]=true;
          break;
        }

      }
    }
    return dp[s.length()];
  }

}

package com.example.workout.leetcode.easy;

import java.util.Arrays;

public class longestCommonPrefix{
    public static void main(String[] args){

        String[] strs = {"test1","test2","tst3"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix_leet(strs));

        /*String str = "helloworld";
        System.out.println(str.indexOf("hello"));
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("lowo"));
        System.out.println(str.indexOf("asdfsf"));*/
    }

    public static String longestCommonPrefix_leet(String[] strs) {

        String longPrefix = strs[0];

        for(int i=1;i<strs.length;i++){

            while(strs[i].indexOf(longPrefix) != 0){
                longPrefix = longPrefix.substring(0,longPrefix.length()-1);

                if(longPrefix.isEmpty()){
                    return "";
                }
            }

        }

        return longPrefix;


    }

    private static String longestCommonPrefix(String[] strs) {

        boolean isTerminate = true;
        int index = 0;
        StringBuffer sb = new StringBuffer();
        int size = strs.length-1;
        while(isTerminate){
            for(int i=0;i<size;i++){

                if(!(strs[i].charAt(index) == strs[i+1].charAt(index))){
                    isTerminate = false;
                    break;
                }

            }
            if(isTerminate){
                sb.append(strs[0].charAt(index));
            }
            index++;
        }

        return sb.toString();

    }
}

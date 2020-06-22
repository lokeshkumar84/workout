package com.example.workout.leetcode.easy;


public class Palindrome{

    public static void main(String[] args){
        String str = "racecar";
        palindrome1(str);
        palindrome2(str);
    }

    private static void palindrome2(String str){

        StringBuffer sb = new StringBuffer();
        sb.append(str);
        if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Yes palindrome");
        }else{
            System.out.println("Nope, it is not palindrome");
        }

    }

    private static void palindrome1(String str){
        char ch[] = str.toCharArray();
        boolean isPalindrome = true;

        for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--){

            if(ch[i] != ch[j]){
                isPalindrome = false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("It is palindrome.");
        }else{
            System.out.println("Not a palindrome string");
        }
    }
}

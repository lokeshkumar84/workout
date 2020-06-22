package com.example.workout.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray{

    public static void main(String[] args){

        int[] array2 = {2,4,5};
        int[] array1 = {0,0,0,0,0,0};


        int[] result = mergeSortedArray(array1, array2);

        for(int res=0;res<result.length;res++){
            System.out.println(result[res]);
        }
        System.out.println("------");
        int[] result1 = mergeSortedArrayLeetCode(array1, array2);

        for(int res=0;res<result1.length;res++){
            System.out.println(result1[res]);
        }

    }

    private static int[] mergeSortedArrayLeetCode(int[] array1, int[] array2){



        System.arraycopy(array2,0,array1,array2.length,array2.length);
        Arrays.sort(array1);

        return array1;
    }

    private static int[] mergeSortedArray(int[] array1, int[] array2){

        int i=0,j =0, k=0;
        int[] result = new int[array1.length+array2.length];
        while(i < array1.length && j < array2.length){

            result[k++] = (array1[i]<array2[j] ? array1[i++]:array2[j++]);

        }

        if(i < array1.length){
            while(i<array1.length){
                result[k++] = array1[i++];
            }
        }
        if(j < array2.length){
            while(j<array2.length){
                result[k++] = array2[j++];
            }
        }

        return result;

    }
}

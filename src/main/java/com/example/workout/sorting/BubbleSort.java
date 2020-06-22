package com.example.workout.sorting;

public class BubbleSort{

    public static void main(String[] args){
        int[] array = {123,4,5,6,2,3,9,1,89,12,12,15,2};
        bubblesort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static void bubblesort(int[] array){

        boolean isSorted=false;
        int lastIndex = array.length-1;
        while(!isSorted){
            isSorted = true;
            for(int i=0;i<lastIndex;i++){

                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                    isSorted=false;
                }
            }
            lastIndex--;

        }

    }

    private static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[i+1];
        array[i+1] = tmp;
    }

}

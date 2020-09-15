package com.example.workout.datastructure.search;

public class BinarySearch {

    public static void main(String args[]){
        int[] arr = { 1, 2,3,4,5,6,10,20};
        System.out.println(printBinarySearch(arr, -10));
    }

    private static int printBinarySearch(int[] arr, int element) {

        int low = 0;
        int high = arr.length - 1 ;
        int mid = 0;

        while(low <= high){
            mid = (low + high) / 2;
            if(element < arr[mid]){
                high = mid - 1;
            }
            else if(element > arr[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}

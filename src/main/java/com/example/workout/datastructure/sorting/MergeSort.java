package com.example.workout.datastructure.sorting;

public class MergeSort {

  public static void main(String args[]){

    int array[] = {2,3,4,19,6,1};
    mergeSort(array,array.length);
    for(int i:array){
      System.out.println(i);
    }
  }

  private static void mergeSort(int[] array, int n){
    if(n < 2){
        return;
    }
    int middle = n/2;
    int left[] = new int[middle];
    int right[] = new int[n-middle];
    for(int i=0;i<middle;i++){
      left[i] = array[i];
    }
    for(int i=middle;i<n;i++){
      right[i-middle] = array[i];
    }

    mergeSort(left,middle);
    mergeSort(right, n - middle);
    merge(array, left, right, middle, n-middle);
  }

  private static void merge(int[] array, int[] left, int[] right, int leftStart, int rightEnd){

    int i=0, j=0, k=0;
    while(i < leftStart && j < rightEnd){
      if(left[i] <= right[j]){
        array[k++] = left[i++];
      }else{
        array[k++] = right[j++];
      }
    }
    while (i < leftStart){
      array[k++] = left[i++];
    }
    while (j < rightEnd){
      array[k++] = right[j++];
    }
  }

}

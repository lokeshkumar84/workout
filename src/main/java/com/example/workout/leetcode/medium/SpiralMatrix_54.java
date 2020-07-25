package com.example.workout.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMatrix_54{


    public static void main(String[] args){

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(matrix).forEach(System.out::println);

    }

    private static List<Integer> spiralOrder(int[][] matrix){

        List<Integer> result = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;

        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;
        /*
        [ 1, 2, 3 ],
        [ 4, 5, 6 ],
        [ 7, 8, 9 ]
         */

        while((rowBegin <= rowEnd) && (columnBegin <= columnEnd)){

            for(int i = columnBegin; i <= columnEnd; i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i <= rowEnd; i++){
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if(rowBegin <= rowEnd){
                for(int i = columnEnd; i >= columnBegin; i--){
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            if(columnBegin <= columnEnd){
                for(int i = rowEnd; i >= rowBegin; i--){
                    result.add(matrix[i][columnBegin]);
                }
                columnBegin++;
            }
        }
        return result;
    }
}

package com.example.workout.leetcode.medium;
/*
In a given grid, each cell can have one of three values:

the value 0 representing an empty cell;
the value 1 representing a fresh orange;
the value 2 representing a rotten orange.
Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.

 Input: [{2,1,1},{0,1,1},{1,0,1}]
Output: -1

Input: [[2,1,1],[1,1,0],[0,1,1]]
Output: 4

Input: [[0,2]]
Output: 0

 */

import java.util.HashSet;
import java.util.Set;

public class RottingOranges{



    public static void main(String[] args){

        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));

    }

    public static int orangesRotting(int[][] grid) {

        int minutes=0;
        Set<String> rotten = new HashSet<String>();
        Set<String> fresh = new HashSet<String>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 2){
                    rotten.add(""+i+j);
                }else if(grid[i][j] == 1){
                    fresh.add(""+i+j);
                }
            }
        }

        while(fresh.size() > 0){

            int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

            Set<String> infectedRotten = new HashSet<>();

            for(String str: rotten){


                int i = str.charAt(0) - '0';
                int j = str.charAt(1) - '0';

                for(int[] direction: directions){
                    int nextI = i + direction[0];
                    int nextJ = j + direction[1];
                    if(fresh.contains(""+nextI+nextJ)){
                        fresh.remove(""+nextI+nextJ);
                        infectedRotten.add(""+nextI+nextJ);
                    }
                }

            }
            if(infectedRotten.size() == 0){
                return -1;
            }
            rotten = infectedRotten;
            minutes++;

        }

        return minutes;


    }
}

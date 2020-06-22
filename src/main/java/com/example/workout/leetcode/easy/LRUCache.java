package com.example.workout.leetcode.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class    LRUCache{

    public static void main(String arg[]){
        usingLinkedHashMap();
    }

    private static void usingLinkedHashMap(){
        int capacity = 3;
        LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
                return size() > capacity;
            }
        };

        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);

        System.out.println(cache.getOrDefault(1,-1));
        System.out.println(cache.getOrDefault(3,-1));

        cache.put(4,4);
        System.out.println(cache.getOrDefault(2,-1));
    }
}

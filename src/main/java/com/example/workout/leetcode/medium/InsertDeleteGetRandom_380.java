package com.example.workout.leetcode.medium;

import java.util.*;

/*
Design a data structure that supports all following operations in average O(1) time.



insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements (it's guaranteed that at least one element exists when this method is called).
Each element must have the same probability of being returned.
 */
public class InsertDeleteGetRandom_380 {

    public static void main(String args[]) {

        // Init an empty set.
        RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomSet.insert(1);

// Returns false as 2 does not exist in the set.
        randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
        randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
        randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
        randomSet.remove(1);

// 2 was already in the set, so return false.
        randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always return 2.
        randomSet.getRandom();
    }

}
class RandomizedSet {

    Map<Integer,Integer> dict;
    List<Integer> list;
    Random random = new Random();

    /** Initialize your data structure here. */
    public RandomizedSet() {

        dict = new HashMap<>();
        list = new ArrayList<>();

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {

        if(dict.containsKey(val)) {
            return false;
        }
        dict.put(val,list.size());
        list.add(list.size(), val);

        return true;

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {

        if(!dict.containsKey(val)){
            return false;
        }

        int index = dict.get(val);
        int lastelement = list.get(list.size()-1);

        dict.put(lastelement,index);
        dict.remove(val);
        list.set(index,lastelement);
        list.remove(list.size()-1);

        return true;

    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

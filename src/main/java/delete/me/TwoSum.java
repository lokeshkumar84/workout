package delete.me;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {10,2,3,4,5};
        Arrays.stream(twoSum(array,13)).forEach(System.out::println);

    }
   static Map<Integer, Integer> cache = new HashMap<Integer,Integer>();
    private static int[] twoSum(int[] array, int target){
        int[] result = new int[2];

        for(int i = 0;i<array.length;i++) {
            if(cache.containsKey(target-array[i])){
                result[0] = cache.get(target-array[i]);
                result[1] = i;
                return result;

            }else{
                cache.put(array[i],i);
            }
        }
        return result;
    }
}

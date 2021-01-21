package delete.me;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        //fib = 1,1,2,3,5,8,13
        System.out.println(fib(7));
    }

    static Map<Integer, Integer> cache = new HashMap<>();
    private static int fib(int target) {
        recursiveFib(target);

        return cache.get(target);

    }

    private static int recursiveFib(int i) {

        if (!(cache.containsKey(i))) {
            if (i <= 2) {
                cache.put(i, 1);
            } else {
                cache.put(i, recursiveFib(i - 1) + recursiveFib(i - 2));
            }
        }
        return cache.get(i);
    }
}

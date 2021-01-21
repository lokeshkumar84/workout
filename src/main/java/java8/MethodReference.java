package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(Support::square).forEach(System.out::println);
        list.stream().map(Support::square).collect(Collectors.toMap(x -> x,Support::convertString)).forEach((k,v) -> System.out.println(k+"|"+v));

    }
}
class Support {
    public static int square(int x){
        return x*x;
    }

    public static String convertString(int x){
        return String.valueOf(x);
    }
}

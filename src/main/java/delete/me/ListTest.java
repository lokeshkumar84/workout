package delete.me;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //list.remove(1);
        list.stream().forEach(System.out::println);

        List<Integer> list1 = new ArrayList<Integer>(list);
        list1.add(6);
        list1.remove(0);
        list1.stream().forEach(System.out::println);
    }
}

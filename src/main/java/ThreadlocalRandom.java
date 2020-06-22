import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class ThreadlocalRandom{

    public static void main(String[] args){
        ArrayList<Integer> arraylist = new ArrayList<>();
        IntStream.range(0,100).forEach(i -> arraylist.add(ThreadLocalRandom.current().nextInt(1, 100)));
        Collections.sort(arraylist);
        arraylist.forEach(i -> System.out.println(i));

    }
}

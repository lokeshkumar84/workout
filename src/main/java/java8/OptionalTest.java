package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) throws Exception {

        Optional.ofNullable(getList()).orElse(new ArrayList<Integer>(Arrays.asList(123,123)));
        Optional.ofNullable(getList()).orElseThrow(Exception::new);

    }
    private static List<Integer> getList(){
        return null;
    }
}

package delete.me;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1,3,2,4,9,7};

        boolean isSorted = true;
        int index = array.length-1;
        while(isSorted){
            isSorted = false;
            for(int i=0;i<index;i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = true;
                }
            }
            index--;
        }

        Arrays.stream(array).forEach(System.out::println);

    }
}

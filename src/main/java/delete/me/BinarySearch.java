package delete.me;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(array);
        System.out.println(binarySearch(array,8));
    }

    private static int binarySearch(int[] array, int element){

        int low = 0;
        int high = array.length-1;
        int mid;

        while(low < high){
            mid = (low + high)/2;
            if(array[mid] == element){
                return mid;
            }
            else if(array[mid] < element){
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
    return  -1;
    }
}

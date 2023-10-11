package methods;

import java.util.List;
import java.util.Objects;

public class BinarySearch {


    //Java already has binarySearch method
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T elem){
        int low = 0;
        int high = list.size()-1;
        while (low<=high){
            int mid = (low + high)/2;
            T guess = list.get(mid);

            int comparison = guess.compareTo(elem);


            if (Objects.equals(guess, elem)){
                return mid;
            } else if (comparison>0) {
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}

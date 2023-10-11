import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static methods.BinarySearch.binarySearch;
import static methods.MaxNumInList.maxNumInList;
import static methods.QuickSort.quickSort;


public class Main {
    public static void main(String[] args) {



        /*
        //binary search
        List<Character> chars = new ArrayList<>();

        for (char i = 'a'; i<'z'; i++){
            chars.add(i);
        }

        System.out.println("The element you are searching for is on position #"+binarySearch(chars, 'k'));*/


        /*
        //Max number in the list
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,51,34,234,64,2,12,5));

        int maxInt = maxNumInList(integers);

        System.out.println(maxInt);*/


        //Quick sort function
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,51,34,234,64,2,12,5,25,45,256, 12, 74, 83 ,35, 74, 93));

        List<Integer> sortedInts = quickSort(integers);

        System.out.println(sortedInts);


    }
}
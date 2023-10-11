package methods;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {


    //Quick sort function
    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        } else {
            Integer pivot = list.get(0);
            List<List<Integer>> lessAndGraterLists = getLessAndGreaterLists(list, pivot);
            return getListFromThree(lessAndGraterLists.get(0), pivot, lessAndGraterLists.get(1));
        }
    }

    //Function which return List of two List.
    //First list has all numbers which are less than pivot, second has all number which are greater than pivot
    private static List<List<Integer>> getLessAndGreaterLists(List<Integer> list, Integer pivot){
        List<List<Integer>> lessAndGreaterLists = new ArrayList<>();
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (Integer num : list.subList(1, list.size())) {
            if (num <= pivot) {
                less.add(num);
            } else {
                greater.add(num);
            }
        }
        lessAndGreaterLists.add(less);
        lessAndGreaterLists.add(greater);
        return lessAndGreaterLists;
    }

    //Returns List of numbers from list of numbers that less than the pivot,
    //the pivot and list of numbers that grater than the pivot
    private static List<Integer> getListFromThree (List<Integer> less, Integer pivot, List<Integer> greater){
        List<Integer> resultList = new ArrayList<>(quickSort(less));
        resultList.add(pivot);
        resultList.addAll(quickSort(greater));
        return resultList;
    }
}

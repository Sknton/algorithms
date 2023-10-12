import methods.BFS_method.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static methods.BFS_method.BFS.BFSMethod;


public class Main {
    public static void main(String[] args) {



/*
        //binary search
        List<Character> chars = new ArrayList<>();

        for (char i = 'a'; i<'z'; i++){
            chars.add(i);
        }

        System.out.println("The element you are searching for is on position #"+binarySearch(chars, 'k'));
*/


/*
        //Max number in the list
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,51,34,234,64,2,12,5));

        int maxInt = maxNumInList(integers);

        System.out.println(maxInt);
*/


/*
        //Quick sort function
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,51,34,234,64,2,12,5,25,45,256, 12, 74, 83 ,35, 74, 93));

        List<Integer> sortedInts = quickSort(integers);

        System.out.println(sortedInts);
*/


/*
        //BFS
        Map<String, List<Person>> graph = new HashMap<>();
        graph.put("me", new ArrayList<>(List.of(
                new Person("Alice", false),
                new Person("Bob", false),
                new Person("Claire", false))));
        graph.put("Alice", new ArrayList<>(List.of(
                new Person("Peggy", false))));
        graph.put("Bob", new ArrayList<>(List.of(
                new Person("Anuj", false),
                new Person("Peggy", false))));
        graph.put("Claire", new ArrayList<>(List.of(
                new Person("Thom", false),
                new Person("Jonny", true))));
        graph.put("Jonny", new ArrayList<>());
        graph.put("Thom", new ArrayList<>());
        graph.put("Peggy", new ArrayList<>());
        graph.put("Anuj", new ArrayList<>());

        Person mangoSeller = BFSMethod(graph);

        System.out.println(mangoSeller);
*/


    }
}
import methods.BFS_method.Person;

import java.util.*;

import static methods.BFS_method.BFS.BFSMethod;
import static methods.DijkstraAlgorithm.dijkstraAlgorithm;
import static methods.DijkstraAlgorithm.printDijkstraResults;


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


        //Dijkstra's algorithm
        Map<String, Map<String, Long>> graph = new HashMap<>(Map.of(
                "Start", Map.of("A", 6L, "B", 2L),
                "A", Map.of("Fin", 1L),
                "B", Map.of("A", 3L, "Fin", 5L),
                "Fin", Collections.emptyMap()
        ));

        Map<String, Long> costs = new HashMap<>(Map.of("A", 6L,
                "B", 2L,
                "Fin", Long.MAX_VALUE));

        Map<String, String> parents = new HashMap<>(Map.of("A", "Start",
                "B", "Start"));
        parents.put("Fin", null);

        List<String> processed = new ArrayList<>();

        Long distanceToFin = dijkstraAlgorithm(costs, processed, graph, parents);

        printDijkstraResults(distanceToFin, parents);


    }
}
package methods.BFS_method;

import java.util.*;

public class BFS {

    //Finds a person who sells mango  :)
    public static Person BFSMethod(Map<String, List<Person>> graph) {
        List<Person> searchedPeople = new ArrayList<>();
        Queue<Person> searchQueue = new PriorityQueue<>(graph.get("me"));
        while (!searchQueue.isEmpty()) {
            Person person = searchQueue.poll();
            if (!searchedPeople.contains(person)){
                if (person.getMangoSeller()) {
                    return person;
                } else {
                    searchQueue.addAll(graph.get(person.getName()));
                    searchedPeople.add(person);
                }
            }

        }
        return null;
    }
}

package methods;

import java.security.Key;
import java.util.*;

public class DijkstraAlgorithm {
    public static Long dijkstraAlgorithm(Map<String, Long> costs,
                                                        List<String> processed,
                                                        Map<String, Map<String, Long>> graph,
                                                        Map<String, String> parents) {
        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            Long cost = costs.get(node);
            Map<String, Long> neighbors = graph.get(node);
            for (String n : neighbors.keySet()) {
                Long newCost = cost + neighbors.get(n);
                if (costs.get(n)>newCost){
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }
        return costs.get("Fin");
    }

    private static String findLowestCostNode(Map<String, Long> costs, List<String> processed) {
        Long lowestCost = Long.MAX_VALUE;
        String lowestCostNode = null;
        for (String costNode : costs.keySet()) {
            Long cost = costs.get(costNode);
            if (cost < lowestCost && !processed.contains(costNode)) {
                lowestCost = cost;
                lowestCostNode = costNode;
            }
        }
        return lowestCostNode;
    }


    public static void printDijkstraResults(Long distanceToFin, Map<String, String> parents){
        System.out.println("The shortest way to Fin is: " + distanceToFin);
        String key = "Fin";
        Stack<String> resultPass = new Stack<>();
        resultPass.push("Fin");
        while (!key.equals("Start")){
            key = parents.get(key);
            resultPass.push(key);
        }

        while (!resultPass.empty()){
            System.out.print(resultPass.pop()+" ");
        }
    }



}

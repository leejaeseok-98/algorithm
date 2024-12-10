package algorithm_basic;

import java.util.*;

public class DFSExample {
    public static void main(String[] args) {
//        그래프 초기화
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2,3));
        graph.put(2, Arrays.asList(1,4));
        graph.put(3, Arrays.asList(1,4));
        graph.put(4, Arrays.asList(2,3));

//        DFS탐색
        dfs(graph,1);
    }
    public static void dfs(Map<Integer,List<Integer>> graph, int start){
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);
        while (!stack.isEmpty()){
            int node = stack.pop();

            if (!visited.contains(node)){
                visited.add(node);
                System.out.println("Visited : " + node);

//                인접노드역순으로 추가
                List<Integer> neighbors = graph.get(node);
                if (neighbors != null){
                    for (int i = neighbors.size() - 1; i >= 0; i--){
                        if (!visited.contains(neighbors.get(i))){
                            stack.push(neighbors.get(i));
                        }
                    }
                }
            }
        }
    }
}

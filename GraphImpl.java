import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphImpl {
    public static void bfs(List<List<Integer>> graph, int node, boolean[] visited){
        Queue<Integer> queue=new LinkedList();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int ele=queue.poll();
            System.out.println(ele);
            for(int neigh : graph.get(ele)){
                if(!visited[neigh]){
                    queue.add(neigh);
                    visited[neigh]=true;
                }
            }
        }
    }
    public static void dfs(List<List<Integer>> graph, int node, boolean[] visited){
        System.out.println(node);
        visited[node]=true;
        for(int neighbour : graph.get(node)){
            if(!visited[neighbour]){
            dfs(graph, neighbour, visited);
            }
        }
    }
    public static void main(String[] args) {
        int V=4;
        List<List<Integer>> graph= new ArrayList<>();
        for(int i=0; i<=V;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(4);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(2);
        graph.get(3).add(4);
        graph.get(4).add(1);
        graph.get(4).add(3);
        System.out.println(graph);
        dfs(graph, 1, new boolean [graph.size()]);
    }

}

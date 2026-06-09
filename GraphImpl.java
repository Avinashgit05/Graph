import java.util.ArrayList;
import java.util.List;

public class GraphImpl {
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
    }
    
}

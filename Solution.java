import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static int maxPathLength = Integer.MIN_VALUE;
    static Map<Long,List<Long>> buildGraph(List<Edge> edges){
        Map<Long,List<Long>> graph = new HashMap<>();
        for(int i=0;i<edges.size();i++){
            long source = edges.get(i).getFrom().getId();
            long destination = edges.get(i).getTo().getId();
            if(!graph.containsKey(source)){
                graph.put(source,new ArrayList<>());
            }
            graph.get(source).add(destination);
        }
        return graph;
    }

    static void dfs(long source, int pathLength, Map<Long, List<Long>> graph){
        if(!graph.containsKey(source)){
            maxPathLength = Math.max(maxPathLength, pathLength);
            return;
        }

        for(long child : graph.get(source)){
            dfs(child,pathLength+1,graph);
        }
    }



    public static void main(String [] args){

        List<Edge> edges = new ArrayList<>();
        Edge e1 = new Edge(new Vertex(1),new Vertex(2));
        edges.add(e1);
        //System.out.println(e1.getFrom().getId());
        //System.out.println(e1.getTo().getId());
        edges.add(new Edge(new Vertex(1), new Vertex(6)));
        edges.add(new Edge(new Vertex(6),new Vertex(7)));
        edges.add(new Edge(new Vertex(2),new Vertex(3)));
        edges.add(new Edge(new Vertex(3),new Vertex(4)));
        edges.add(new Edge(new Vertex(4),new Vertex(5)));
        edges.add(new Edge(new Vertex(2),new Vertex(8)));
        edges.add(new Edge(new Vertex(8),new Vertex(9)));
        edges.add(new Edge(new Vertex(9),new Vertex(10)));
        edges.add(new Edge(new Vertex(2),new Vertex(11)));
        edges.add(new Edge(new Vertex(11),new Vertex(12)));
        edges.add(new Edge(new Vertex(12),new Vertex(13)));
        edges.add(new Edge(new Vertex(13),new Vertex(14)));
        edges.add(new Edge(new Vertex(14),new Vertex(15)));
        edges.add(new Edge(new Vertex(15),new Vertex(16)));

        //System.out.println(edges.size());

        Map<Long,List<Long>> graph = buildGraph(edges);
        /*for(Edge e : edges){
            System.out.print(e.getFrom().getId());
            System.out.println(e.getTo().getId());
        } */

        System.out.println("The graph built is :- ");
        System.out.println(graph.toString());

        long source = 2 ;
        List<Long> nodes = graph.get(source);
        for(long nextNode : nodes){
            dfs(nextNode,1,graph);
        }

        System.out.println("The longest path from source 2 is " + ":" + " " +  maxPathLength);

    }
}

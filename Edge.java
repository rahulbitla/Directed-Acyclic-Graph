public class Edge {
    private Vertex from;
    private Vertex to;

    public Edge(Vertex from, Vertex to){
        this.from = from;
        this.to = to;
    }

    public Vertex getFrom(){
        return this.from;
    }

    public Vertex getTo(){
        return this.to;
    }
}

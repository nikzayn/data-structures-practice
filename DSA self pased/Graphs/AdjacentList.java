public class AdjacentList {
    static void addEdge(Arraylist<Arraylist<Integer>> adj, int u, int v) {
        adj.get(u).add(v)
        adj.get(v).add(u)
    }


    static void printGraph(Arraylist<Arraylist<Integer>>adj) {
        for(int i = 0; i < adj.size(); i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.println(adj.get(i).get(i) + " ")
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 5;
        Arraylist<Arraylist<Integer>> adj = new Arraylist<Arraylist<Integer>>(v);
        for(int i = 0; i < v; i++) {
            adj.add(new Arraylist<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        printGraph(adj);
    }
}


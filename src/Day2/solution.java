package Day2;
import java.util.*;
public class solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> AdjacencyList=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            AdjacencyList.add(new ArrayList<>());
        }
        boolean[] visited=new boolean[5];

        //Adding edges
        addEdge(0,2,AdjacencyList);
        addEdge(0,1,AdjacencyList);
        addEdge(1,2,AdjacencyList);
        addEdge(1,3,AdjacencyList);
        addEdge(2,3,AdjacencyList);
        addEdge(2,4,AdjacencyList);
        addEdge(3,4,AdjacencyList);

        for (ArrayList<Integer> integers : AdjacencyList) {
            System.out.println(integers);
        }
        DFS(0,visited,AdjacencyList);
    }

    //Creating Adjacency List
    private static void addEdge(int source,int destination,ArrayList<ArrayList<Integer>> AdjacencyList)
    {
        AdjacencyList.get(source).add(destination);
        AdjacencyList.get(destination).add(source);
    }

    //Traversing Through the Depth first search
    private static void DFS(int node,boolean[] visited,ArrayList<ArrayList<Integer>> AdjacencyList)
    {
        visited[node]=true; //mark current node as visited
        System.out.println(node); //print the current node
        for(int neighbour : AdjacencyList.get(node)) //For every adjacent node
        {
            if(!visited[neighbour]) // if not visited DFS on it.
            {
                DFS(neighbour,visited,AdjacencyList);
            }
        }
    }



}
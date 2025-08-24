package Day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        BFS(0,visited,AdjacencyList);
    }

    //Creating Adjacency List
    private static void addEdge(int source,int destination,ArrayList<ArrayList<Integer>> AdjacencyList)
    {
        AdjacencyList.get(source).add(destination);
        AdjacencyList.get(destination).add(source);
    }

    //Traversing Through the Depth first search
    private static void BFS(int node,boolean[] visited,ArrayList<ArrayList<Integer>> AdjacencyList)
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        visited[node]=true;
        while(!q.isEmpty())
        {
            int removed=q.poll();
            System.out.println(removed);
            for(Integer neighbour : AdjacencyList.get(removed))
            {
                if(!visited[neighbour])
                {
                    q.offer(neighbour);
                    visited[neighbour]=true;
                }
            }
        }
    }



}
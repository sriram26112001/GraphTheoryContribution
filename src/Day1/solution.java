package Day1;
import java.util.*;
public class solution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> AdjacencyList=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            AdjacencyList.add(new ArrayList<>());
        }

        //Input values
        Add('A','C',AdjacencyList);
        Add('A','B',AdjacencyList);
        Add('A','D',AdjacencyList);
        Add('C','D',AdjacencyList);
        Add('B','C',AdjacencyList);
        Add('C','E',AdjacencyList);
        Add('E','F',AdjacencyList);
        Add('C','F',AdjacencyList);

        //printing the Adjacency list
        for(int i=0;i<AdjacencyList.size();i++)
        {
            char node=(char)('A'+i);
            System.out.println(node + " -> " + AdjacencyList.get(i));
        }
    }
    private static void Add(char source,char destination,ArrayList<ArrayList<Character>> AdjacencyList)
    {
        int u = source -'A';
        int v = destination - 'A';
        AdjacencyList.get(u).add(destination);
        AdjacencyList.get(v).add(source);
    }
}

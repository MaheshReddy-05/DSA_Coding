// BFS in adj List
import java.util.*;

public class BFS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of Nodes");
        int N = sc.nextInt();
        System.out.println("No of Edges Connections");
        int E = sc.nextInt();
        List<List<Integer>> al = new ArrayList<>();
        al = adjList(N, E);
        List<Integer> bl = bfsAdjList(al);
        System.out.println(Arrays.asList(bl));
        sc.close();
    }
    public static List<Integer> bfsAdjList(List<List<Integer>> al){
        List<Integer> bfs = new ArrayList<>();
        Queue<Integer> qu = new LinkedList<>();
        boolean visited[] = new boolean[al.size()];
        if(al.size()>1){
            qu.add(1);
            visited[1] = true;
        }
        while(!qu.isEmpty()){
            int l = qu.remove();
            bfs.add(l);
            for(int i : al.get(l)){
                if(visited[i]==false){
                    visited[i]= true;
                    qu.add(i);
                }
            }
        }
        return bfs;
    }
    public static List<List<Integer>> adjList(int N,int E) {
        List<List<Integer>> al = new ArrayList<>();
        for(int i =0;i<=N;i++){
            al.add(new ArrayList<>());
        }
       Scanner sc = new Scanner(System.in);
        while(E!=0){
            E--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            al.get(a).add(b);
            al.get(b).add(a);
        }
        sc.close();
        return al;
    }
}
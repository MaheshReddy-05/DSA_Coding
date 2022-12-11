// BFS in adj List
import java.util.*;

public class DFS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of Nodes");
        int N = sc.nextInt();
        System.out.println("No of Edges Connections");
        int E = sc.nextInt();
        List<List<Integer>> al = new ArrayList<>();
        al = adjList(N, E);
        System.out.println("Hello");
        List<Integer> bl = new ArrayList<>();
        boolean visited[] = new boolean[N+1];
        Arrays.fill(visited, false);
        bfsAdjList(1, visited, al, bl);
        System.out.println(Arrays.asList(bl));
        sc.close();
    }
    public static void bfsAdjList(int node, boolean visited[],List<List<Integer>> al,List<Integer> ans){
        ans.add(node);
        visited[node] = true;
        for(Integer i : al.get(node)){
            if(visited[i]==false){
                bfsAdjList(i, visited, al, ans);
            }
        }
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
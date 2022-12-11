
import java.util.*;
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of Nodes");
        int N = sc.nextInt();
        System.out.println("No of Edges Connections");
        int E = sc.nextInt();
        
    }
    public static int[][] adjMatrix(int N,int E) {
        int A[][] = new int[N+1][N+1];
        while(E!=0){
            E--;
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            A[a][b] = 1;
            A[b][a] = 1;
        }
        return A;
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
        return al;
    }
    public static void printAdjList(List<List<Integer>> al){
        for(int i =1;i<al.size();i++){
            System.out.print("Adj List for "+i);
            System.out.println();
            for(int j = 0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static List<List<pair>> weigAdjList(int N,int E) {
        List<List<pair>> al = new ArrayList<>();
        for(int i =0;i<=N;i++){
            al.add(new ArrayList<>());
        }
        Scanner sc = new Scanner(System.in);
        while(E!=0){
            E--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int weig = sc.nextInt();
            pair obj1 = new pair(b, weig);
            pair obj2 = new pair(a, weig);
            al.get(a).add(obj1);
            al.get(b).add(obj2);
        }
        return al;
    }
}
class pair{
    int value;
    int weg;
    public pair(int value,int weg){
        this.value = value;
        this.weg = weg;
    }
}
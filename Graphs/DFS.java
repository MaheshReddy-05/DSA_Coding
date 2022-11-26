import java.util.*;

public class DFS{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int adjMatrix[][] = new int[n][n];
            int edg = sc.nextInt();
            inputGraph(adjMatrix, n,edg);
            // int adjMatrix[][] = { {0,1,1,0,0},{1,0,0,1,0},{1,0,0,0,1},{0,1,0,0,0},{0,0,1,0,0} };
            for(int[]i : adjMatrix){
                for (int j  : i) {
                    System.out.print(j);
                }
                System.out.println();
            }
            int ver[]= new int[n];
            Arrays.fill(ver, -1);
            DFStrav(adjMatrix, 0, ver);
        }
    }
    public static void DFStrav(int[][] adjMatrix,int center,int ver[]){
        System.out.print(center+" ");
        ver[center] = 1;
        for(int i=0;i<adjMatrix.length;i++){
            if(adjMatrix[center][i]==1 && ver[i]==-1){
                DFStrav(adjMatrix, i, ver);
            }
        }
    }
    public static void inputGraph(int[][] adjMatrix,int n,int edg){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<edg;i++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                adjMatrix[l][r] = 1;
                adjMatrix[r][l] = 1;
            }
        }
    }
}
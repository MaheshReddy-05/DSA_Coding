/*
 * Test Case
    6 4
    0 1
    0 2
    1 2
    3 4
 */
public class Island {
    public static void main(String[] args) {
        // int adjMatrix [][] = { {0,1,1,0,0},{1,0,0,1,0},{1,0,0,0,1},{0,1,0,0,0},{0,0,1,0,0} };
        int adjMatrix[][] = {{0,1,1,0,0,0},{1,0,1,0,0,0},{1,1,0,0,0,0},{0,0,0,0,1,0},{0,0,0,1,0,0},{0,0,0,0,0,0}};
        int n = adjMatrix.length;
        boolean verify [] = new boolean[n];
        int count =0;
        for(int i =0;i<n;i++){
            if(!verify[i]){
                count++;
                dfs(adjMatrix,i,verify);
            }
        }
        System.out.println(count);
    }
    public static void dfs(int [][] adjMatrix,int vi,boolean []verify){
        verify[vi] = true;
        for(int i=0;i<adjMatrix.length;i++){
            if(verify[i] == false && adjMatrix[vi][i]==1){
                dfs(adjMatrix,i,verify);
            }
        }
        }
}

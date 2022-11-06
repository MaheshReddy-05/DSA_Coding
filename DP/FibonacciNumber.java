public class FibonacciNumber {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int dp[] = new int[9];
        System.out.println(helper(8, dp));
    }
    public static int helper(int n,int []dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n-1]==0){
            dp[n-1] = helper(n-1, dp);

        }
        if(dp[n-2]==0){
            dp[n-1] = helper(n-2, dp);
        }
        return dp[n-1] +dp[n-2];
        
    }
}
/*
 *  5th index we will check 4 and 3rd
 */

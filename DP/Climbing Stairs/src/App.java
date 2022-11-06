import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(sc.nextInt()));
        int [] dp = new int[n+1];
        System.out.println(dp(n, dp));
    }
    public static int dp(int n,int []Dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(Dp[n]!=0)return Dp[n];
        return Dp[n] = dp(n-3,Dp)+dp(n-2,Dp)+dp(n-1,Dp);
    }
    public static int helper(int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return helper(n-3)+helper(n-2)+helper(n-1);
    }
}

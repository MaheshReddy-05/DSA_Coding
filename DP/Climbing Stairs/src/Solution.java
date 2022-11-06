public class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        return helper(n,k,target);
    }
    public int helper(int n,int k,int target){
        // System.out.println("hello"+n+"target"+target);
        if(n<0) return 0; 
        if(n==0 && target==0) {
            // System.out.println("jjjjjjj");
            return 1;
        }
        int ans = 0;
        for(int i=1;i<=k;i++){
            ans+= helper(n-1,k,target-i);
        }
        // System.out.println("answer"+ ans);
        return ans;
    }
}
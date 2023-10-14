// Pair having same values also

class Solution {
    public int countKDifference(int[] nums, int k) {
        int n= nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
            
        int ans=0;
        for(int i=0; i<n; i++)
        {
            int value1= nums[i]-k;
            int value2= nums[i]+k;
            if(map.containsKey(value1))
                ans=ans+map.get(value1);   
            if(map.containsKey(value2))
                ans=ans+map.get(value2); 
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
        }
        return ans;
    }
}
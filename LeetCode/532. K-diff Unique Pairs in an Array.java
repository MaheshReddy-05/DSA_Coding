// Unique k differ paris

class Solution {
    public int findPairs(int[] nums, int k) {
        int n =nums.length;
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i =0;i<n;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
        int count =0;

      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        int val = entry.getValue();
        int key = entry.getKey();

        if(k==0){
          if(val>=2)
            count++;
        }

        else if(map.containsKey(key+k))
        count++;
      }  
        return count;
    }
}
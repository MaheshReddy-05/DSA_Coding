Problem Link: https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/

class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],2);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])!=2 && !hm.containsKey(nums[i]-1) && !hm.containsKey(nums[i]+1)){
                al.add(nums[i]);
            }
        }
        return al;
    }
}
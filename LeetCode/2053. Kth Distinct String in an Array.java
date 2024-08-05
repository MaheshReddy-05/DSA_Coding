Problem Link: https:https://leetcode.com/problems/kth-distinct-string-in-an-array/
Author: Mahesh Reddy B N

class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            String currS = arr[i];
            int currF = hm.get(arr[i]);
            if(currF==1){
                k--;
                if(k==0) return currS;
            }
        }
        return "";
    }
}
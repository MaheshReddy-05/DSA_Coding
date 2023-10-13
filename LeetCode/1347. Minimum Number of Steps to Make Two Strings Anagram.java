// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/


class Solution {
    public int minSteps(String s, String t) {
        int sl = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        int ans = s.length();
        for(int i = 0;i<s.length();i++){
            char curr = s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        for(int i=0;i<sl;i++){
            char curr = t.charAt(i);
            if(hm.containsKey(curr)){
                ans--;
                int cou = hm.get(curr);
                if(cou==1){
                    hm.remove(curr);
                }
                else{
                    hm.put(curr,cou-1);
                }
            }
        }
        return ans;
    }
}
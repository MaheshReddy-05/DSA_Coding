// Problem Link: https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=daily-question&envId=2024-02-05
// Author: Mahesh Reddy B N
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.get(c)==1) return i;
        }
        return -1;
    }
}
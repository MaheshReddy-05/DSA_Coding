// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/counting-words-with-a-given-prefix/description/


class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String s: words){
            System.out.println(s+" "+pref);
            if(pref.length()>s.length()) continue;
            count += (s.substring(0,pref.length()).equals(pref)) ? 1:0;
        }
        return count;
    }

}
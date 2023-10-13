// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/valid-palindrome/description/


class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String us = "";
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if((curr>='a' && curr<='z') || (curr>='A' && curr<='S') || (curr>='0' && curr<='9')){
                us+= curr;
            }
        }
        System.out.println(us);
        int usl = us.length();
        for(int i=0;i<usl/2;i++){
            if(us.charAt(i)!=us.charAt(usl-i-1)) return false;
        }
        return true;
    }
}
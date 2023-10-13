// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/break-a-palindrome/

class Solution {
    public String breakPalindrome(String s) {
        int sl = s.length();
        if(sl==1){
                return "";
        } 
        char []arr = s.toCharArray();
        boolean check = false;
        for(int i=0 ;i<sl/2;i++){
            if(arr[i]!= 'a'){
                arr[i] = 'a';
                check = true;
                break;
            }
        }
        if(!check){
            arr[sl-1] = 'b';
        }
        String ans = "";
        for(char c:arr){
            ans+= c;
        }
        return ans;
    }
}

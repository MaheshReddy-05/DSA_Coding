// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/reverse-words-in-a-string/


class Solution {
    public String reverseWords(String s) {
     int sl = s.length();
     List<String> al = new ArrayList<>();

     String curr = "";
     for(int i=0;i<sl;i++){
         char cur = s.charAt(i);
         if(cur == ' '){
             if(curr.length()>0){
                 al.add(curr);
                 curr = "";
             }
             else{
                 continue;
             }
         }
         else{
             curr+= cur;
         }
     }  
     if(curr.length()>0) al.add(curr);

     if(al.size()==0) return "";
     curr = "";
     for(int i=al.size()-1;i>0;i--){
         curr+= al.get(i);
         curr+= " ";
     }
     curr+= al.get(0);
      return curr;
    }
}
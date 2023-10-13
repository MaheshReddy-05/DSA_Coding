// Author: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/


class Solution {
    public String[] divideString(String s, int k, char fill) {
        int sl = s.length();
        int strl = 0;
        boolean unsuff = false;
        if(sl%k==0){
            strl = sl/k; 
        }
        else{
            unsuff = true;
            strl = sl/k+1;
        }
        String []str = new String[strl];
        int it1 = 0;
        for(int i=0;i<sl;i+=k){
            int si = i;
            int ei = i+k;
            if(ei<=sl){
                str[it1] = s.substring(si,ei);
                it1++;
            }
        }
        if(unsuff){
            str[it1] = s.substring(sl-(sl%k),sl);
            // System.out.println(sl-(sl%k)+" "+sl);
            for(int i=0;i<(k-(sl%k));i++){
                // System.out.println(s);
                // for(String sk: str){
                //     System.out.print(sk+" ");
                // }
                str[it1]+= fill;
            }
        }
        return str;
    }
}
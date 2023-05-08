Author: Mahesh Reddy BN
Problem Link:https://practice.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Integer")) return 4;
        if(str.equals("Character")) return 1;
        if(str.equals("Long")) return 8;
        if(str.equals("Double")) return 8;
        if(str.equals("Float")) return 4;
        return 0;
    }
}
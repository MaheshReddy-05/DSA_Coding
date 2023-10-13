Problem Link: https://leetcode.com/problems/search-a-2d-matrix/
Author: Mahesh Reddy B N
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int si = 0;
        int ei = matrix.length-1;
        if(ei==-1) return false;
        int mid = 0;
        while(si<=ei){
            mid = si+(ei-si)/2;
            if(matrix[mid][0]==target){
                return true;
            }
            else if (matrix[mid][0]>target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        si = si-1;
        if(si==-1) return false;
        int nsi = 0;
        if(matrix[si].length<=0) return false;
        int nei = matrix[si].length-1;
        while(nsi<=nei){
            mid = nsi+(nei-nsi)/2;
            if(matrix[si][mid]==target){
                return true;
            }
            if(matrix[si][mid]>target){
                nei = mid-1;
            }
            else{
                nsi = mid+1;
            }
        }
        return false;
    }
}
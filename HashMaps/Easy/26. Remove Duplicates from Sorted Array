Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int []ans = new int[arr.length];
        int j = 0;
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                // ans[j] = arr[i];
                arr[j] = arr[i];
                j++;
                count++;
            }
            else{
                map.put(arr[i],1);
            }
        }
        // System.out.println(Arrays.asList(ans));
        // arr = ans;
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // System.out.print(count);
        return count;
    }
}
Problem Link: https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/

class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int total = 0;
        for(int i:piles){
            total+=i;
            pq.add(i);
        }
        while(k!=0){
            k--;
            int curr = pq.poll();
            int n = curr/2;
            total-=n;
            pq.add(curr-n);
        }
        return total;
    }
}
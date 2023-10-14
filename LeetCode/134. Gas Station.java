class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gastotal = 0;
        int costtotal = 0;
        for(int i=0;i<gas.length;i++){
            gastotal +=gas[i];
            costtotal+=cost[i];
        }
        if(costtotal>gastotal) return -1 ;
        int start = 0;
        int remaining = 0;

        for(int i=0;i<gas.length;i++){
            remaining += gas[i]-cost[i];
            if(remaining<0) {
                start = i+1;
                remaining = 0;
            }
        }
        return start;
    }
}
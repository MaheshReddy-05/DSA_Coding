class Solution {
    public int maxDistToClosest(int[] seats) {
        int al = seats.length;
        int left[] = new int [al];
        Arrays.fill(left,-1);
        int right[] = new int [al];
        Arrays.fill(right,-1);
        int lp = -1;
        int rp = -1;
        int max = 0;
        for(int i=0;i<al;i++){
            if(seats[i]==1){
                lp = i;
            }
            else{
                left[i] = lp;
            }
        }
        for(int i=al-1;i>=0;i--){
            if(seats[i]==1){
                rp = i;
            }
            else{
                right[i] = rp;
            }
        }
        for(int i=0;i<al;i++){
            if(seats[i]==0){
                int leftDis = (left[i]!=-1) ? i-left[i] :Integer.MAX_VALUE;
                int rightDis = (right[i]!=-1) ? right[i]-i :Integer.MAX_VALUE;
                int l = Math.min(leftDis,rightDis);
                max = Math.max(max,l);
            }
        }
        return max;
    }
}
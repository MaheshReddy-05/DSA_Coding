class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        int low=intervals[0][0];
        int high=intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
           if(intervals[i][0]<=high){
               if(high<intervals[i][1])
               high=intervals[i][1];
           }
           else{
               res.add(new int[]{low,high});
               low=intervals[i][0];
               high=intervals[i][1];
           }
        }
        res.add(new int[]{low,high});  
       return res.toArray(new int[0][]);     
    }
}
public class reverseArray1{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int m = 3;
        int si = m+1;
        revArr(arr, si, arr.length-1);
        for (int i : arr) {
            System.out.println(i);    
        }

    }
    public static void revArr(int[]arr,int si,int ei){
        if(si>(si+ei)/2) return;
        else{
            int a = arr[si];
            arr[si] = arr[ei];
            arr[ei]= a;
            revArr(arr, si+1, ei-1);
        }
    }
}
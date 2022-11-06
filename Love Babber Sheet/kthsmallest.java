import java.util.*;
public class kthsmallest {
    public static int kthsmallest(int [] arr, int low, int high, int k)
    {
        int pivot=getpivot(arr,low,high);
        if(k-1==pivot)
        {
            return arr[pivot];
        }
        if(pivot>k-1)
        {
            return kthsmallest(arr, low, pivot-1, k);
        }
        else
        {
            return kthsmallest(arr, pivot+1, high, k);
        }
    }
    public static int getpivot(int [] arr, int low, int high)
    {
        int pivot=low;
        int pivotElement=arr[high];
        for(int i=low;i<=high;i++)
        {
            if(arr[i]<pivotElement)
            {
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                pivot++;
            }
        }
        int temp=arr[pivot];
        arr[pivot]=arr[high];
        arr[high]=temp;
        return pivot;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }  
      int k=sc.nextInt();
      System.out.println(kthsmallest(arr, 0, arr.length-1,k));
    }
}

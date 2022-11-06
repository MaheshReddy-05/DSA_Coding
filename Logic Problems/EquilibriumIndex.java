import java.util.*;
public class EquilibriumIndex {
    public static void main(String[] args) throws Exception {
        int arr[] = {1,4,9,3,2};
        int n = arr.length;
        int ls = 0;
        int rs = 0;
        for (int i = 1; i < arr.length; i++) {
            rs+=arr[i];
        }
        // int i=0,j=n-1;
        for(int j2 = 0; j2 < arr.length-1; j2++) {
            if(ls==rs){
                // System.out.print(j2);
                // ls+=arr[j2];
                // rs-=arr[j2+1];
                // k++;
                System.out.println(j2);
            }
            else{
                ls+=arr[j2];
                rs-=arr[j2+1];
            }
        }
    	System.out.println(-1);
    }
}


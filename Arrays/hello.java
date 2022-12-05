import java.util.Arrays;

class hello{
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,1,1,0,0,1,0};
        int j = 0;
        // Two pointer 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        String sl = "Hello dude";
        Integer arrr[] = {10,20,30,40,50};
        arrr[3] = j;
        j = arrr[2];
        System.out.println(Arrays.asList(arrr)+" "+j);
    }
}
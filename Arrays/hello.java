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
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
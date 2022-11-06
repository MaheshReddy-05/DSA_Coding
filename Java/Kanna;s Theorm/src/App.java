public class App {
    public static void main(String[] args) throws Exception {

        int arr[] = {1,2,3,4,-100,5,5,6,-1,3};
        int sum = 0;
        // int index = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[0];
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}

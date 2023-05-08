import java.util.*;
class eleven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            int j = 1;
            for(;j<=i;j++){
                System.out.print(j);
            }
            for(int k = 1;k<=(2*a-2*i);k++){
                System.out.print(" ");
            }
            j--;
            for(;j>=1;j--){
                System.out.print(j);
            }


            System.out.println();
        }
    }
}
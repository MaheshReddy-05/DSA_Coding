import java.util.*;
class seven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>=1;i--){
            for(int j =1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i-1)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
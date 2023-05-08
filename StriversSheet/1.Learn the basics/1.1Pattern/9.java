import java.util.*;
class nine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean check = false;
        for(int i=0;i<=2*a && i>=0;){
            if(i>=a){
                check = true;
            }
            if(check){
                if(i==0) return;
                i--;
            }
            else{
                i++;
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
import java.util.*;
class ten{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean check = false;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                check = true;
            }
            for(int j=1;j<=i;j++){
                if(check){
                    System.out.print(1);
                    check = false;
                }
                else{
                    System.out.print(0);
                    check = true;
                }
            }
            System.out.println();
        }
    }
}
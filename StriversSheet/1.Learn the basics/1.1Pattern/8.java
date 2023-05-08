import java.util.*;
class eight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean check = false;
        for(int i=0;i<=2*a+1 && i>=0;){
            if(i>=a){
                check = true;
            }
            if(check){
                i--;
            }
            else{
                i++;
            }
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
import java.util.*;
class thirteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
    }
}
import java.util.*;
class fourteen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print((char)(64+(a-j+1)));
            }
            System.out.println();
        }
    }
}
package Patteren;

import java.util.Scanner;

//  This is how the Right Triangle look
// *
// * *
// * * *
// * * * *
// * * * * *
public class RightTriangle  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

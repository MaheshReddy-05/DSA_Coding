import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String arr[] = s.split(" ");
      s="";
      for(int i=0;i<arr.length;i++){
        s+=arr[i];
      }
      System.err.println(s);
    }
}
import java.util.*;
public class BasicRecursion{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1. Finding Fibonacci Number\n"+"2. Summation\n"+"3. Check Palindrome\n"+"4. ArrayReverse\n" +"5. Finding the power"+"Enter the Above Option : \n");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                System.out.println("Enter which Fibonacci Number You want : ");
                int b = sc.nextInt();
                System.out.println(Fibonacci(b));
                    break;
                case 2:
                System.out.println("Enter Till which Number You Want Sum");
                int sl = sc.nextInt();
                System.out.println(Summation(sl));
                    break;
                case 3:
                System.out.println("Enter The String : ");
                String s = sc.next();
                boolean f = Palindrome(0, s);
                if(f){
                    System.out.println("String is Palindrome");
                }
                else System.out.println("It is not Palindrome");
                    break;
                case 4:
                System.out.println("Enter the Array Size :");
                int Array_size = sc.nextInt();
                List<Object> lst = new ArrayList<>();
                System.out.println("Enter the Elements in Array : ");
                for (int i = 0; i < Array_size; i++) {
                    lst.add(sc.next());
                }
                ArrayReverse(0, lst);
                case 5:
                System.out.println("Enter Number and power");
                int Number = sc.nextInt();
                int Power = sc.nextInt();
                System.out.println(Mult(Number, Power));
                default:
                    break;
            }
            sc.close();
        }
        public static int Summation(int i){
            if(i<1){
                return 0;
            }
            else{
                return i+Summation(i-1);
            }
        }
        public static int Fibonacci(int a){
            if(a==0){
                return 0;
            }
            else if(a==1){
                return 1;
            }
            else{
                return Fibonacci(a-1)+Fibonacci(a-2);
            }
        }
        static boolean Palindrome(int i,String s){
            if(i>=(s.length()/2)){
                return true;
            }
            if((s.charAt(i))!=(s.charAt((s.length())-i-1))){
                return false;
            }
            return Palindrome(i+1, s);
        }
        public static void ArrayReverse(int n,List<Object> lst){
            if(n>=lst.size()/2){
                System.out.println(lst);
            }
            else{
                Collections.swap(lst,n,lst.size()-n-1);
                ArrayReverse(n+1, lst);
            }
        }
        public static int Mult(int x,int y){
            if(y==0){
                return 1;
            }
            return x*Mult(x,y-1);
        }
    }
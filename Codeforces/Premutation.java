import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            n--; 
            int num = sc.nextInt();
            int k = num*(num+1)/2;
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<num-1;i++){
                int data = sc.nextInt();
                k-=data;
                al.add(data);
            }
            int position = -1;
            for(int i=0;i<num-1;i++){
                int data = sc.nextInt();
                if(data == k) position = i;
            }
            int l = num-2;
            while(l!=0){
                l--;
                for(int i=0;i<num-1;i++){
                    int data = sc.nextInt();
                }
            }
            if(position==num-2) position = num-1;
            
            int j = 0;
            for(int i=0;i<num;i++){
                if(i==position){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print(al.get(j)+" ");
                    j++;
                }
            }
        }
    }
}
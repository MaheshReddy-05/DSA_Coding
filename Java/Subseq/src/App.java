import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,3};
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ars = new ArrayList<Integer>();
        fun(ls, ars, 0, arr);
        System.out.println(ls);
       }
    static void fun(List<List<Integer>> ls,List<Integer> ars, int init,int arr[]){
        if(init == arr.length){ 
            ls.add(new ArrayList(ars));
            return;
        }
        else{
            ars.add(arr[init]);
            fun(ls, ars, init+1, arr);
            ars.remove(ars.size()-1);
            fun(ls, ars, init+1, arr);
        }   
    }
}
 
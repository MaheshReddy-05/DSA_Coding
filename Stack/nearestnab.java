package Stack;

import java.util.*;

public class nearestnab{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        List<Integer> al = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                al.add(-1);
                st.add(arr[i]);
            }
            else{
                if(st.peek()>arr[i]){
                    al.add(st.peek());
                    // System.out.println(arr[i]+" "+st.peek());
                    st.add(arr[i]);
                }
                else{
                    boolean found = false;
                    while(!st.isEmpty()){
                        if(st.peek()>arr[i]){
                            al.add(st.peek());
                            st.add(arr[i]);
                            found = true;
                            break;
                        }
                        else{
                            st.pop();
                        }
                    }
                    if(st.isEmpty() && !found){
                        al.add(-1);
                        st.add(arr[i]);
                    }
                }
            }
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }
    }
}
import java.util.*;
public class finding {
    public static void main(String[] args) {
        char [][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int verify [][] = new int[maze.length][maze[0].length];
        for(int[]i :verify){
            Arrays.fill(i,-1);
        }
        int [] start = {1,2};
        int level =0;
        if(start[0]<=maze.length-1 && start[1]<=maze[0].length-1 && ( start[0]==maze.length-1 || start[1]==maze[0].length-1)) {level = 0;}
        Queue<int[]>  q = new LinkedList<>();
        q.add(start);


        while(!q.isEmpty()){
            level++;
            int size = q.size();
            for(int i =0;i<size;i++){
                    
            }
        }
    }
}

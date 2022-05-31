import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        // exit point
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0; i<nr;i++){
            for(int j = 0; j<nc; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        exitpoint(mat);
    }
    public static void exitpoint(int mat[][]) {
        // dim
        int nr = mat.length, nc = mat[0].length;
        // init
        // D : 0 -> E, 1-> S, 2 -> W, 3 -> N
        int r = 0, c = 0, dir = 0;

        int ans_row = -1, ans_col = -1;

        while(!(r < 0 || c < 0 || r >= nr || c >= nc)){
          dir = (dir + mat[r][c]) % 4; // dir update
          
          // store previous coordinate
          ans_row = r;
          ans_col = c;

          // change 
          if(dir==0) c++;
          else if(dir==1) r++;
          else if(dir==2) c--;
          else r--;
          
        }
        
        System.out.println(ans_row);
        System.out.println(ans_col);
        
    }

}
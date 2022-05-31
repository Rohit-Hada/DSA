// Spiral Display without using functions

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int arr[][] = new int[n][m];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n*m;
        int cnt = 0;

        while(cnt < tne){
            // left wall
            for(int i = minr, j = minc; i<=maxr && cnt < tne; i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            // bottom wall
            for(int i = maxr, j = minc; j<=maxc && cnt < tne; j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            // right wall
            for(int i = maxr, j = maxc; i>=minr && cnt < tne; i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            // top wall
            for(int i = minr, j = maxc; j>=minc && cnt < tne; j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }

}

// Spiral Display With Functions

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        spiralDisplay(mat);
        
    }
    public static void spiralDisplay(int mat[][]){
        int rmin = 0, cmin = 0, rmax = mat.length-1, cmax = mat[0].length-1;
        int tne = mat.length*mat[0].length;
        int count = 0;
      while(count < tne){
         // left wall
        for(int r = rmin, c = cmin; r<=rmax && count < tne;r++){
            System.out.println(mat[r][c]);
            count++;
        }
        // bottom wall
        for(int r = rmax, c = cmin+1; c<=cmax && count < tne;c++){
            System.out.println(mat[r][c]);
            count++;
        }
        // right wall
        for(int r = rmax-1, c = cmax; r>=rmin && count < tne; r--){
            System.out.println(mat[r][c]);
            count++;
        }
        // top wall
        for(int r = rmin, c = cmax-1; c>=cmin+1 && count < tne; c--){
            System.out.println(mat[r][c]);
            count++;
        }

        rmin++;
        cmin++;
        rmax--;
        cmax--;

     
      }

    }
       
}

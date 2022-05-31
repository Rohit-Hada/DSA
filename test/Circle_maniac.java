import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        int r1 = scn.nextInt();
        int r2 = scn.nextInt();

        int distsqr = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        int radsqr = (r1+r2)*(r1+r2);
          
        if(distsqr == radsqr){
            System.out.print("overlaps");
        }else if(distsqr>radsqr){
            System.out.print("far-apart");
        }else if(r1+r2 = 0 || r1-r2 = 0){
            System.out.print("concentric");
        }else if((r1-r2) < r1+r2 ){
            System.out.print("touches at 2 point");
        }else{
            System.out.print("touches at 1 point");
        }
    
    }
}
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int y1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y2 = scn.nextInt();
        int r1 = scn.nextInt();
        int r2 = scn.nextInt();

        int d = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);

        if(d==0) System.out.println("concentric");

        else if(d==(r1+r2)*(r1+r2)) System.out.println("touches at 1 point");

        else if(d > (r1+r2)*(r1+r2)) System.out.println("far-apart");

        else if(d < (r1+r2)*(r1+r2) && d > (r1-r2)*(r1-r2)) System.out.println("touches at 2 point");

        else System.out.println("overlaps");
    }
}

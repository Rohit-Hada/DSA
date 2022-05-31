// 2D array without function
import java.util.*;
  
public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // input for no. of row & column
    int n = scn.nextInt();
    int m = scn.nextInt();

    // creating a 2D Array

    int mat[][] = new int[n][m];

    // Inserting data in 2D Array
    for(int i = 0; i<n; i++){
      for(int j = 0; j<m; j++){
        mat[i][j] = scn.nextInt();

        System.out.print(mat[i][j]+" "); // printing value 
      }
      // next line
      System.out.println();
    }
   }
  }
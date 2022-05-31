import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i<arr.length; i++){
            int lvc = 0;
            for(int j = 1; j<arr[0].length; j++){
                if(arr[i][j]<arr[i][lvc]){
                    lvc = j;
                }
            }
             boolean flag = true;
            for(int k = 0; k<arr.length; k++){
                if(arr[k][lvc]> arr[i][lvc]){
                    flag = false;
                    break;

                }
            }
            if(flag==true){
                System.out.print(arr[i][lvc]);
                return;
            }
         }
         System.out.print("Invalid input");
    }

}

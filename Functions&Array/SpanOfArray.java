public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx<n ; idx++){
            arr[idx] = scn.nextInt();
        }
        int ans = spanofArray(arr);
        System.out.print(ans);
     }
       public static int spanofArray(int arr[]){
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;
    
           for (int v1 : arr ) {
               if(v1 > max){  //better maximum
                 max = v1 ;  
               }
               
               if(v1 < min){  //better minimum
                 min = v1 ;  
               }
    
       }
       return max-min;
      }
    
    }
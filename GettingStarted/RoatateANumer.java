public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int ans = 0;
      int temp = n ;
      int count = 0;
      while(temp != 0){
          temp = temp/10;
          count++;
      }
      // true rotation
         k = k%count;
      // negative rotation
       if(k<0){
          k = k + count;
         }
      // split helper
      int splithelper = (int)Math.pow(10,k);
      int p1 = n / splithelper ;
      int p2 = n % splithelper ;
      // merge helper
      int mergehelper = (int)Math.pow(10,count-k); 
      ans = (p2*mergehelper) + p1;
      System.out.print(ans);
     } 
}

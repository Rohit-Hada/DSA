public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int count =0 ;
      int temp = n;

      while(temp!=0){
          temp /= 10;
          count++;
      }
      int div = (int)Math.pow(10,count-1);

      while(div!=0){
          int q = n/div;
          System.out.println(q);
          n %= div;
          div /= 10;
      }
     }
}
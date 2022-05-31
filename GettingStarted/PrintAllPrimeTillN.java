public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low; i<=high; i++){
         boolean isprime = true;
         for(int div = 2; div*div<=i; div++){
             if(i%div == 0){
                 isprime = false;
                 break;
             }
         }
         if(isprime){
             System.out.println(i);
         }   
        }
    }
}
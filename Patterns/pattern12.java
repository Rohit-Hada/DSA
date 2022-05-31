public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          
         int n = scn.nextInt();
         int a = 0;
         int b = 1; 
        // write ur code here
        for(int r = 1; r<=n ; r++){
            int nst = r;

            for(int c = 1 ; c<=nst ; c++){

             int sum = a + b;
             System.out.print(a+"\t");
             a = b;
             b = sum; 
            }
            System.out.println();
        }

    }
}
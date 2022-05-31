public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
      for(int r = 1; r<=n; r++ ){
           int nst = r ;
           int nsp = n - r ;

           for(int i = 1; i<=nsp; i++ ){
               System.out.print("\t");
           }
            for(int i = 1; i<=nst; i++ ){
           System.out.print("*\t");
          }
          System.out.println();
       }

    }
}
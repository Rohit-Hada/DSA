public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       // Accepting input 
       int n = scn.nextInt();
       // Creating Variale for no. of stars and spaces
       int nst = n;
       int nsp = 0;
       // Creating loops to print nst and nsp
           for(int i = 1; i<=n; i++){
             for(int j = 1; j<=nsp; j++){
                 System.out.print("\t");
             }
             for(int j = 1; j<=nst; j++){
                 System.out.print("*\t");
             }
       // Preparation for next line
             System.out.println();
             nst-- ;
             nsp++ ;
       }
        
    }
}
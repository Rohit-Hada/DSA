public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();
       int nst = n;
       int nsp = 0; 
       for(int r = 1; r<=n ; r++){
           // space
           for(int i = 1; i<=nsp ; i++){
               System.out.print("\t");
           }
           // stars
           for(int i = 1; i<=nst ; i++){
               if(r>1 && r<=n/2 && i>1 && i<nst){ 
                 System.out.print("\t");     
               }else{
                 System.out.print("*\t");
               }
           }
            // preparation for next line
            System.out.println();
            if(r<=n/2){
                nst-=2;
                nsp++;
            }else{
              nst = nst + 2;
              nsp = nsp - 1; 

            }

        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int n = scn.nextInt();
       for(int r = 1; r <=n ; r++){
           for(int c = 1; c <=n ; c++){
            //    space or star
            if(c==1 || c==n){
                System.out.print("*\t");
            }else if(r>n/2 && (r==c || r+c==n+1)){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
         }
            // line
            System.out.println();
         }
       
       }

 }
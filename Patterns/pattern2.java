public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n != 0){
            int i=n ;
            while(i !=0){
                System.out.print("*\t");
                i-- ;
            }
            System.out.println();
            n--;
        }

    }
}
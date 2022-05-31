public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = factorial(n);

        System.out.println(ans);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int factNm1 = factorial(n-1);
        int factN = n * factNm1;

        return factN;
    }

}



























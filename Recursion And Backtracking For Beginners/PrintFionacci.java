public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = fib(n);

        System.out.println(ans);
    }

    public static void fib(int n){
        if (n <= 1)
        return n;

        return fib(n - 1)+ fib(n - 2);

    }

}

// public static int fib(int n) {
//     if(n == 0 || n == 1) return n;
//     return fib(n-1) + fib(n-2);
    
// }
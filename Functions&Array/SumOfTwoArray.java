public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // input
        int n1 = scn.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = scn.nextInt();
        }

        int res[] = sum(arr1, arr2);
        display(res);
    }

    public static void display(int arr[]){
        for(int vl : arr){
            System.out.println(vl);
        }
    }


    public static int[] sum(int arr1[],int arr2[]){
        int size = Math.max(arr1.length,arr2.length);

        int res[] = new int[size];

        int p1 = arr1.length-1, p2 = arr2.length-1 , p3 = size-1;
        int carry = 0;

        while(p3 >= 0){
            int v1 = (p1 >= 0) ? arr1[p1] : 0;
            int v2 = (p2 >= 0) ? arr2[p2] : 0;

            int sum = v1 + v2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            res[p3] = digit;

            p1--; p2--; p3--;
        }

        if(carry == 0){
            return res;
        }else{
            int newRes[] = new int[size+1];
            newRes[0] = carry;
            for(int i  = 1; i < newRes.length ; i++){
                newRes[i] = res[i-1];
            }
            return newRes;
        }
    }
}
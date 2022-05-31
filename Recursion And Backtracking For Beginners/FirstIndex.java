public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        int fidx = firstIndex(arr, 0, scn.nextInt());
        System.out.println(fidx);
    }

   

    public static int firstIndex(int arr[],int idx,int target){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }else{
            return firstIndex(arr, idx+1, target);
        }
    }
}
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
    int n1 = scn.nextInt();
    int a1[] = new int[n1];

    for(int i = 0; i<n1; i++){
        a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int a2[] = new int[n2];
    for(int  i = 0; i<n2; i++){
        a2[i] = scn.nextInt();
    }

    int diff[] = new int[n2];
    int c = 0, i = a1.length - 1, j = a2.length - 1, k = a2.length - 1;

    while(k >= 0){
        int d = 0;
        int a1val = i>=0 ? a1[i] : 0;

        if(a2[j]+c>=a1val){
            d = a2[j]+c - a1val;
            c = 0;
        }
        else{
            d = a2[j]+c+10 - a1val;
            c = -1;
        }

        diff[k] = d;
        
        k--;
        i--;
        j--;
    }

    int idx = 0;;
    while(diff[idx]==0){
        idx++;
   }
    while(idx<diff.length){
         System.out.println(diff[idx]);
         idx++;
   }
}
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int i=0; i<T; i++){
		   	int n=sc.nextInt(); 
		   	int arr[]=new int[n];
	       	for(int j=0; j<n; j++){
		    arr[j]=sc.nextInt();
		}
		int[] ans=reverse(arr);
		for(int k=0; k<ans.length; k++){
		    System.out.print(ans[k]+" ");
		}
	
		}

	 }
		      
	public static int[] reverse(int arr[]){
	    int start=0;
	    int end=arr.length-1;
	    int temp;
          
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
	}
	
}
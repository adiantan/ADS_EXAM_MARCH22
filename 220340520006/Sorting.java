class Sorting{
	void arraySort(int[]a){
		int n=a.length;
		int temp,j,x;
		for(int i=n-1;i>=0;i--){
			 temp=a[i];
		     j=i-1;
			 x=0;
			while(j>=0&&a[j]>temp){
				temp=a[j+1]=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
				
			   
			}
			x=a[j+1];
			a[j+1]=temp;
			temp=x;
			System.out.println(Arrays.toString(a)+"   "+temp);
			
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String []args){
		int []arr={1,2,4,5,3};
		Sorting s = new Sorting();
		
		//System.out.print("before sorting"+Arrays.toString arr[i]);
		s.arraySort(arr);
		//System.out.print("After sorting"+Arrays.toString arr[i]);
		
	}
}
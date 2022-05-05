class StackArray{
	
	int arr[];
	int length;
	int top1;
	int top2;
	StackArray(int size){
	    arr=new int [size];
		length=size;
		top1=-1;
		top2=size;
		
	}
	
	void push1(int data1){
		if(top1<top2-1){
			top1++;
			arr[top1]=data1;
			
		}else{
			System.out.println("Stack overflow");
		}
	}
	
	void push2(int d2){
		if(top1<top2-1){
			top2--;
			arr[top2]=d2;
			
		}else{
			System.out.println("Stack overflow");
		}
	}
	
	int pop1(){
		if(top1>=0){
	     int data1=arr[top1--];
		 return data1;
			
			
		}
		return 0;
	  }
	int pop2(){
		if(top2<length){
		 int d2=arr[top2--];
			return d2;
			
		}
		return 0;
	 }
	
	
	public static void main(String[]args){
		StackArray s1 = new StackArray(6);
		
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		
		System.out.println("Popped element from stack1 is  "+s1.pop1());
		System.out.println("Popped element from stack1 is  "+s1.pop2());
		
	}
}
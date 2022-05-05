class ReverseLinkList{
	//Node head;
	Node oldhead;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void insert(int d){
		Node newNode= new Node(d);
		
		
		newNode.next=oldhead;
		oldhead=newNode;
		
	}
	
	void display(){
		Node n= oldhead;
		System.out.println("Original LinkList");
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	Node head;
	void reverse(Node temp){
		
		
		while(oldhead!=null){
			temp=oldhead;
			oldhead=oldhead.next;
			
			temp.next=head;
			head=temp;
		}
		
	}
	void reverseDisplay(){
		Node p=head;
		System.out.println("Revers LinkList");
		while(p!=null){
			System.out.print(p.data+"->");
			p=p.next;
		}
	}
	void revlist(){
		reverse(oldhead);
		
	}
	
	public static void main(String[]args){
		ReverseLinkList  list=new ReverseLinkList();
		
		list.insert(5);
		list.insert(4);
		list.insert(3);
		list.insert(2);
		list.insert(1);
		
		list.display();
		
		System.out.println(" ");
		list.revlist();
		list.reverseDisplay();
		
	}
	
	
}
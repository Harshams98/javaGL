package Circular;



public class Linkk {
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	//add insert
	void addFirst(String data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		newnode.next=head;
		head =newnode;
		
	}

	void addlast(String data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node currnode=head;
		while(currnode.next != null)
		{
			currnode=currnode.next;
		}
		currnode.next=newnode;
		
	}
	void printlist() {
		Node currnode=head;
		while(currnode.next != null)
		{
			System.out.println(currnode.data);
			currnode=currnode.next;
		}
		System.out.println("null");
		
		
	}
	
	public static void main(String[] args) {
		
		Linkk li=new Linkk();
		li.addFirst("harsha");
		li.addFirst("suresh");
		li.addlast("mysore");
		li.addlast("Mahendarkar");
		li.addFirst("karnataka");
		li.printlist();
		}

}

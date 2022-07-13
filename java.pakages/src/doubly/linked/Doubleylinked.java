package doubly.linked;

public class Doubleylinked {
class Node{
	
	String data;
	
	Node previous;
	Node next;
	Node(String data){
		this.data=data;
	}
	
	
	
}
Node head=null;
Node tail=null;

void add(String data) {
	Node newnode=new Node(data);
	
	if(head==null) {
		
		head=newnode;
		tail=newnode;
		
		head.previous=null;
		tail.next=null;
	}
	else {
		tail.next=newnode;
		
		newnode.previous=tail;//head
		
		tail=newnode;
		tail.next=null;
	}
}
	void show() {
		Node current =head;
		
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	public static void main(String[] args) {

		Doubleylinked obj=new Doubleylinked();
		obj.add("Harsha");
		obj.add("Mahendarkar");
		obj.add("Suresh");
		obj.show();
	}

}

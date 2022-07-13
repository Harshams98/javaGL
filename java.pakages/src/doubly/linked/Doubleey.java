package doubly.linked;

public class Doubleey {
	

	public static void main(String[]args) {
		
		Node node=new Node(0);
		node.add(2);
		node.add(4);
		node.add(6);
		node.add(1);
		
		node.print();
		System.out.println("---------reverse-------------");
		node.printreverse();
		
		
	}
}
class Node{
	int data;
	Node previous;
	Node next;
	
	Node(int data){
		this.data=data;
	}
			

Node head=null;
Node tail=null;

void add(int data) {
	Node newNode=new Node(data);
	
	if(head==null) {
		head=newNode;
		tail=newNode;
		head.previous=null;
		tail.next=null;
	}
	else {
		tail.next=newNode;
		
		newNode.previous=tail;
		
		tail=newNode;
		tail.next=null;
	}
}
	void print() {
		Node currobj=head;
		if(head==null) {
			System.out.println("List is Empty");
		}
		while(currobj!=null) {
			System.out.println(currobj.data);
			currobj=currobj.next;
			
		}
		//System.out.println("null");
		
	}
	void printreverse() {
		Node currobj=tail;
		if(head==null) {
			System.out.println("List is Empty");
		}
		while(currobj!=head) {
			System.out.println(currobj.data);
			currobj=currobj.previous;
			
		}
		System.out.println(currobj.data);
		
	}
}

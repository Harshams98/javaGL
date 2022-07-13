package collections_linkedlist;

public class Linkedlistwithoutcollection {
	Node head=null;
	Node tail=null;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			
		}
	
	}
		
		public void adds(String data) {
			Node newNode=new Node(data);
			
			if(head==null) {
				head=tail=newNode;
				head.next=null;
				tail.next=null;
			}
			else
			{
				newNode.next=head;
				head=newNode;
			}
		}
		public void addlast(String data) {
			Node newNode=new Node(data);
			
			if(head==null) {
				head=tail=newNode;
				head.next=null;
				tail.next=null;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}
		}
		public void printing() {
			Node current=head;
			if(head==null) {
				System.out.println("The list is empty");
			}
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
			
		}
		void clear() {
			head=tail=null;
		}
	
	
	
	public static void main(String[] args) {
		Linkedlistwithoutcollection obje=new Linkedlistwithoutcollection();
		
		//void addlast
		System.out.println("--Add Last");
		obje.addlast("Suresh");
		obje.addlast("Mahendarkar");
		obje.addlast("Harsha");
		obje.printing();
		System.out.println("\nClear stmnt");
		obje.clear();
		obje.printing();
		System.out.println("\n--a+ ddfirst");
		obje.adds("Suresh");
		obje.adds("Mahendarkar");
		obje.adds("Harsha");
		
		obje.printing();
		
		

	}

}

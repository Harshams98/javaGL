package trees.youtube;

class Node{
	 int value;
	Node left;
	Node right;
	Node(int value){
		this.value=value;
		
	}
}
class Travel{
	Node root;
	void preorder(Node n) {//s2 n=t.root
		//root left right
		if(n!=null) {
			System.out.print(" "+n.value);;//s3 prints t.root
		preorder(n.left);//s4 prints t.root.left and comes again to print c.left
		 

		//it comes from node n so no error
		preorder(n.right);//s5 prints t.root.left.right value
	}
	}
	void postorder(Node n){
		if(n!=null) {
			postorder(n.left);
			postorder(n.right);
			System.out.print(" "+n.value);
			//it comes from node n soo no error
		}
		
	}
	void innorder(Node n){
		if(n!=null) {
			innorder(n.left);
			System.out.print(" "+n.value);
			innorder(n.right);
			
			//it comes from node n soo no error
		}
		
	}
}
public class Treetravelsal_binaray {

	public static void main(String[] args) {

		Travel t=new Travel();
		t.root=new Node(5);//value=5
		t.root.left=new Node(6);
		t.root.right=new Node(7);
		t.root.left.left=new Node(8);
		t.root.left.right=new Node(9);
		
	
		//as long as there is a connection possible it will work
		
		System.out.print("preorder = ");
		
		//Full working step by step
		t.preorder(t.root);//Always pass root  node
		//s1 send t.root value to preorder
		
		System.out.println();
		
		
		System.out.print("postorder = ");
		
		t.postorder(t.root);
		System.out.println();
		System.out.print("inorder = ");
		
		t.innorder(t.root);
		
		
 }

}

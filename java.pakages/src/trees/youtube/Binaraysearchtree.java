package trees.youtube;


class Nodes{
	char data;
	Nodes left;
	Nodes right;
	Nodes(char data){
		this.data=data;
	}
}

class Binarysearchimplimentation{
	Nodes roots;
	void insertinitiaize(char data){
	
		roots = insert(roots,data);
	}
	
	Nodes insert(Nodes roots,char data) {
		if(roots==null) {
			roots = new Nodes(data);
			return roots;
		}
		if(data<roots.data) {
			roots.left=insert(roots.left,data);
		}
		else if(data>roots.data) {
			roots.right=insert(roots.right,data);
		}
		return roots;
	}
	
	void inorderr(Nodes roots) {
		if(roots!=null) {
			inorderr(roots.left);
			System.out.print(" "+roots.data);
			inorderr(roots.right);
		}
	}
		void preorderr(Nodes roots) {
			if(roots!=null) {
				System.out.print(" "+roots.data);
				preorderr(roots.left);
				preorderr(roots.right);
			}
		}
	}
	


public class Binaraysearchtree {

	public static void main(String[] args) {
		Binarysearchimplimentation obj=new Binarysearchimplimentation();
		obj.insertinitiaize('C');
		obj.insertinitiaize('I');
		obj.insertinitiaize('B');
		obj.insertinitiaize('A');
		obj.insertinitiaize('G');
		obj.insertinitiaize('M');
		
		obj.inorderr(obj.roots);
System.out.println("\n-------------");
		obj.preorderr(obj.roots);
	}

}

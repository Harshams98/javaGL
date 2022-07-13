package DSA;
import java.util.*;
public class Queues {

	public static void main(String []args) {
		Queue<Integer> q=new LinkedList<Integer>();
		if(q.isEmpty()){
		q.add(6);
		q.add(7);
		q.add(1);
		q.add(9);
		}
		//System.out.println(q.remove());//first
		System.out.println(q.peek());//first
		System.out.println("-------------");
		Iterator i= q.iterator();
		int [] arr = new int[4];
		int k=0;
		while(i.hasNext()) {
			//System.out.println(i.next());
			arr[k]=(int) i.next();
			System.out.println(arr[k]);
			k++;
		}
		System.out.println("-------------");
		Arrays.sort(arr);
		for (int ii=0;ii<arr.length;ii++) {
			System.out.println(arr[ii]);
		}
	

	}
}

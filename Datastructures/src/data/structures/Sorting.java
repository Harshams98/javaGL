package data.structures;

class Bubble{
	
	public void disp(int []arr) {
		for(int i:arr)
			System.out.print(" "+i);
	}
	
	public void bubblesort(int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])//a[j]<a[i] both work
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
	}
	
 
     
    }


public class Sorting {

	public static void main(String[] args) {

		int arr[]= {5,4,3,2,1};
		
		Bubble bubble=new Bubble();
		System.out.println("before sorting");
		bubble.disp(arr);
		
		bubble.bubblesort(arr);
		System.out.println();
		bubble.disp(arr);
		
		
	

	}

}

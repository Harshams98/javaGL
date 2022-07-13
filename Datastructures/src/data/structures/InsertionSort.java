package data.structures;

public class InsertionSort {
	public void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int sortvalue = arr[i];
            int j;
            // If we get smaller value than sortvalue then , we stop at that index.
            for ( j = i; j > 0 && arr[j - 1] > sortvalue; j--) {
                arr[j] = arr[j - 1];
            }
 
            // We will put sortvalue at that index
            arr[j] = sortvalue;
           
           
        }
    }
	public void disp(int []arr) {
		for(int i:arr)
			System.out.print(" "+i);
	}

	public static void main(String[] args) {
		
		
		int arr[]= {5,4,3,2,1};
		
		InsertionSort is=new InsertionSort();
		
		System.out.println("before sorting");
		is.disp(arr);
		
		System.out.println("\nAfter sorting");
		is.insertionSort(arr);
		is.disp(arr);

	}

}

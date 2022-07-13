package data.structures;

import java.util.Scanner;

public class Datastructures_arrays {
	
	static int[] get() {
		
		return new int[] {1,2,3,4};
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//Array representation

		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=20;
		arr[2]=30;
		arr[3]=11;
		arr[4]=166;
		System.out.println();
		
		for(int disp:arr)
			System.out.println(disp);
		
		String data[]= {"Harsha","Mahendarkar","suresh",
				"4NI19MCA15","NIE"};
		System.out.println("-----------");
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		System.out.println("===========");
		int array[]=get();
		for(int i:array)
			System.out.println(i);
	}

}

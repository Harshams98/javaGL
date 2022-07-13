package org.globallogic;

public class ArrayEquals {
	
	public int[] arr(int arr1[],int arr2[])
	{
		int []res=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			res[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<res.length;i++)
		{
			res[i]=arr2[j++];
		}
		
		return res;
	}

}

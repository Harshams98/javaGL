package simpleprograms;
import java.util.*;

public class Minmax_assingment {
	
	static int max=0,min=0;
	static void maxnmin(int[]arr) {
		for (int i = 0;i < arr.length;i++) {
			if (arr [i] > max) {max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("minimum  = "+min);
		System.out.println("Maximum  ="+max);
	}
	public static void main(String[] args) {
		int minimum = 0,maximum=0;
		int[]arr= {3,4,6,11,2,3,0,-1,7};
		
		for(int i=0;i<=5;i++)
		{
			maxnmin(arr);
			minimum +=min;
			maximum +=max;		
		}
		System.out.println("mimimum of 5 arrays="+minimum);
		System.out.println("maximum of 5 arrays="+maximum);
	
	}

}

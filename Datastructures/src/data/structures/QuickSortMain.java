package data.structures;

import java.util.Arrays;

public class QuickSortMain {
 
    private static int array[];
 
    public static void sort(int[] arr) {
 
        if (arr == null || arr.length == 0) {
            return;
        }
        array = arr;
        quickSort(0, array.length-1);
    }
 
    private static void quickSort(int left, int right) {
 
        int i = left;
        int j = right;
        //  pivot numberss take it as mid
        int pivot = array[left+(right-left)/2];
 
        while (i <= j) {
           
            while (array[i] < pivot) { i++; } while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // calling quickSort() 
        if (left < j)
            quickSort(left, j);
        if (i < right)
            quickSort(i, right);
    }
 
    private static void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
    public static void main(String a[]){
        int[] input = {3,2,64,11,8,5,1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println("==================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(array));
 
    }
}
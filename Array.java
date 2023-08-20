import java.util.*;

class Array {
	public static void main(String args[])
	{
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.println("The original array is: ");
		Arrays.sort(arr);
		int index =Arrays.binarySearch(arr,12);
		
		System.out.println(index);
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\n");
		for (int num : arr) {
			
			System.out.print(num + " ");
		}
		Arrays.sort(arr,2,arr.length);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

package ex02_06;

import java.util.Arrays;

public class Swap {
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
		swap(arr,0,3);
		
		System.out.println(Arrays.toString(arr));
		// output : [4, 2, 3, 1]
	}
}

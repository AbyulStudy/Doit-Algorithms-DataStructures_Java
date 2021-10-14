package ex02_01;
//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.

import java.util.Arrays;

public class Q02 {
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
		System.out.println(Arrays.toString(a));
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]과(와) a[" + (a.length-1-i) +"]를 교환합니다." );
			swap(a, i, a.length - 1 - i);
		}
	}
	
	public static void main(String[] args) {		
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("배열을 생성했습니다.");
		System.out.println(Arrays.toString(arr));
		System.out.println("교환을 시작합니다..");
		reverse(arr);
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}

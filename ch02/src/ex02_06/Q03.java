package ex02_06;
// 배열 a 의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.

import java.util.Arrays;

public class Q03 {

	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("배열을 생성했습니다.");
		System.out.println(Arrays.toString(arr));
		
		int sum = sumOf(arr);
		System.out.println("배열의 모든 합은 " + sum + "입니다.");
	}
	
}

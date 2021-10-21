package ex02_01;
// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 copy를 작성하세요.

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
	static void rcopy(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++) {
			a[a.length-1-i] = b[i];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수: ");
		int num = stdIn.nextInt();
		
		int[] a = new int[num]; // b를 복사할 a 배열 생성
		int[] b = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		rcopy(a,b);
		System.out.println("a 배열 : " + Arrays.toString(a));
		System.out.println("b 배열 : " + Arrays.toString(b));
	}
}

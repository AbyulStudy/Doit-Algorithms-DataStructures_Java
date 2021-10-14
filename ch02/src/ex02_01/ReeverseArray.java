package ex02_01;
//배열 요소의 값을 읽어 들여 역순으로 정렬합니다.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReeverseArray {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요솟 수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; // 요솟수가 num인 배열
		
		for(int i = 0; i < num; i++) {
//			System.out.print("x[" + i + "] : ");
//			x[i] = stdIn.nextInt();
			x[i] = rand.nextInt(10);
		}
		System.out.println("x 배열 : " + Arrays.toString(x));
		reverse(x); // 배열 a 의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println("x 배열 : " + Arrays.toString(x));
	}
}

package ex02_05;
// MaxOfArrayRand 를 수정하여 키뿐만 아니라 사람 수도 난수로 생성하도록 프로그램을 작성하세요.

import java.util.Random;
import java.util.Scanner;

public class Q01 {
 	// 배열 a의 최댓값을 구하여 반환 합니다.
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
//		System.out.print("사람 수 : ");
//		int num = stdIn.nextInt(); // 배열의 요솟수를 입력 받음
		int num = rand.nextInt(9)+1; // 1 이상 9이하의 숫자의 의사난수로 결정  (0 <= num < 10) + 1
		System.out.println(num);
		

		int[] height = new int[num]; // 요솟수가 num인 배열을 생성

		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	// 요소의 값을 난수로 결정
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
	}
}

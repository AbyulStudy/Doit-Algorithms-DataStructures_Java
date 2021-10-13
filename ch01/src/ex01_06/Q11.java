package ex01_06;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		/*
		 	양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
		 	예를 들어 135를 입력하면 '그 수는 3자리입니다.' 라고 출력하고
		 	1314를 입력하면 '그 수는 4자리입니다.' 라고 출력하면 됩니다.
		 */
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		// 양의 숫자를 입력받습니다.
		do {
			System.out.print("정수값: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// 자릿수를 카운팅 합니다.
		int count = 0;
		while(n > 0) {
			n /= 10;	// n을 10을 나누지 못할때까지 나눕니다.
			count+=1;
		}
		
		System.out.println("그 수는 " + count + "자리입니다.");
		
	}
}

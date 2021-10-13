package ex01_07;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		/*
		 	정사각형을 출력합니다. (n * n)
			단 수: 5
			*****
			*****
			*****
			*****
			***** 
		  	다음과 같이 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
		 */
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정사각형을 출력합니다. (n * n)");
		System.out.print("단 수: ");
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			for(int y = 0; y < n; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

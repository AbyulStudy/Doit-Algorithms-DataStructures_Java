package ex01_06;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		// a , b 정수를 입력 하고 b - a 를 출력하는 프로그램을 작성하세요.
		// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력 받아야 합니다.
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("a의 값 :");
		a = sc.nextInt();

		while(true) {
			System.out.print("b의 값 :");
			b = sc.nextInt();
			if(b > a) {break;}
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		do {
			System.out.print("b의 값 :");
			b = sc.nextInt();
			if(a>b) {System.out.println("a보다 큰값을 입력하세요!");}
		}while(a>b);
		
		System.out.println("b - a는 " + (b-a) + "입니다.");
	}
}

package ex01_06;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		// a , b ������ �Է� �ϰ� b - a �� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// ��, ���� b�� �Է��� ���� a ���ϸ� ���� b�� ���� �ٽ� �Է� �޾ƾ� �մϴ�.
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("a�� �� :");
		a = sc.nextInt();

		while(true) {
			System.out.print("b�� �� :");
			b = sc.nextInt();
			if(b > a) {break;}
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		
		do {
			System.out.print("b�� �� :");
			b = sc.nextInt();
			if(a>b) {System.out.println("a���� ū���� �Է��ϼ���!");}
		}while(a>b);
		
		System.out.println("b - a�� " + (b-a) + "�Դϴ�.");
	}
}

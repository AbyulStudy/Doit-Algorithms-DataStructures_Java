package ex01_06;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1 ���� n������ ���� ���մϴ�.");
		
		// n�� �Է°��� 0 ���� Ŭ ������ �ݺ��մϴ�.
		do {
			System.out.print("n�� ��: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;	// sum �� i �� ���մϴ�.
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}

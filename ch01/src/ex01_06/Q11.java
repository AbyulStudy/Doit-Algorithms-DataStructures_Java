package ex01_06;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		/*
		 	���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 	���� ��� 135�� �Է��ϸ� '�� ���� 3�ڸ��Դϴ�.' ��� ����ϰ�
		 	1314�� �Է��ϸ� '�� ���� 4�ڸ��Դϴ�.' ��� ����ϸ� �˴ϴ�.
		 */
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		// ���� ���ڸ� �Է¹޽��ϴ�.
		do {
			System.out.print("������: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		// �ڸ����� ī���� �մϴ�.
		int count = 0;
		while(n > 0) {
			n /= 10;	// n�� 10�� ������ ���Ҷ����� �����ϴ�.
			count+=1;
		}
		
		System.out.println("�� ���� " + count + "�ڸ��Դϴ�.");
		
	}
}

package ex01_07;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		/*
		 	���簢���� ����մϴ�. (n * n)
			�� ��: 5
			*****
			*****
			*****
			*****
			***** 
		  	������ ���� �Է��� ���� �� ������ �ϴ� ���簢���� *�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 */
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���簢���� ����մϴ�. (n * n)");
		System.out.print("�� ��: ");
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			for(int y = 0; y < n; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

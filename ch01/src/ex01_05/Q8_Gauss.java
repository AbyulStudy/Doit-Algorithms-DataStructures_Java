package ex01_05;

import java.util.Scanner;

public class Q8_Gauss {
	
	public static void main(String[] args) {
		/*
		 	1���� 10������ ���� (1+10) * 5 �� ���� ������� ���� �� �ֽ��ϴ�.
		 	���콺�� �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
		 */
		Scanner stdIn = new Scanner(System.in);
		
		double dN = stdIn.nextDouble();		
		double dSum = (1 + dN) * (dN/2) ;
		System.out.println(dSum);
		
		int iN = stdIn.nextInt();
		int iSum = (iN + 1) * (iN / 2) + (iN % 2 == 1 ? (iN+1) / 2 : 0);
		if(iN%2 ==1) {
			System.out.println(iN+1 + " * " + iN/2 + " + " + (iN+1) / 2);			
		}
		if(iN%2 ==0) {
			System.out.println(iN+1 + " * " + iN/2 + " + " + 0);			
		}
		System.out.println(iSum);
	}

}

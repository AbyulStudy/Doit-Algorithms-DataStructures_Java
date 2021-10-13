package ex01_05;

import java.util.Scanner;

public class Q8_Gauss {
	
	public static void main(String[] args) {
		/*
		 	1부터 10까지의 합은 (1+10) * 5 와 같은 방법으로 구할 수 있습니다.
		 	가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
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

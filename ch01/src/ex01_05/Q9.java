package ex01_05;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i+=1) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = sumof(a,b);
		
		System.out.println(sum);
	}
}

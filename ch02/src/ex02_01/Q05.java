package ex02_01;
// �迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� copy�� �ۼ��ϼ���.

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
	static void rcopy(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++) {
			a[a.length-1-i] = b[i];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 b�� ��ڼ�: ");
		int num = stdIn.nextInt();
		
		int[] a = new int[num]; // b�� ������ a �迭 ����
		int[] b = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		rcopy(a,b);
		System.out.println("a �迭 : " + Arrays.toString(a));
		System.out.println("b �迭 : " + Arrays.toString(b));
	}
}

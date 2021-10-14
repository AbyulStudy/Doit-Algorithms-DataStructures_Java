package ex02_01;
//�迭 ����� ���� �о� �鿩 �������� �����մϴ�.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReeverseArray {
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}

	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("��� �� : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num]; // ��ڼ��� num�� �迭
		
		for(int i = 0; i < num; i++) {
//			System.out.print("x[" + i + "] : ");
//			x[i] = stdIn.nextInt();
			x[i] = rand.nextInt(10);
		}
		System.out.println("x �迭 : " + Arrays.toString(x));
		reverse(x); // �迭 a �� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		System.out.println("x �迭 : " + Arrays.toString(x));
	}
}

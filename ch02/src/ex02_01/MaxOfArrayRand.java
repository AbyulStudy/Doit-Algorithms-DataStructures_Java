package ex02_01;

import java.util.Random;
import java.util.Scanner;

//�迭 ����� �ִ��� ��Ÿ���ϴ�(���� ������ ����)

public class MaxOfArrayRand {
 	// �迭 a�� �ִ��� ���Ͽ� ��ȯ �մϴ�.
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt(); // �迭�� ��ڼ��� �Է� ����

		int[] height = new int[num]; // ��ڼ��� num�� �迭�� ����

		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	// ����� ���� ������ ����
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
	}
}

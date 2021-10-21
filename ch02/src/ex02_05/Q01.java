package ex02_05;
// MaxOfArrayRand �� �����Ͽ� Ű�Ӹ� �ƴ϶� ��� ���� ������ �����ϵ��� ���α׷��� �ۼ��ϼ���.

import java.util.Random;
import java.util.Scanner;

public class Q01 {
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
//		System.out.print("��� �� : ");
//		int num = stdIn.nextInt(); // �迭�� ��ڼ��� �Է� ����
		int num = rand.nextInt(9)+1; // 1 �̻� 9������ ������ �ǻ糭���� ����  (0 <= num < 10) + 1
		System.out.println(num);
		

		int[] height = new int[num]; // ��ڼ��� num�� �迭�� ����

		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);	// ����� ���� ������ ����
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("�ִ밪�� " + maxOf(height) + "�Դϴ�.");
	}
}

package ex02_06;
// �迭 a �� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���.

import java.util.Arrays;

public class Q03 {

	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("�迭�� �����߽��ϴ�.");
		System.out.println(Arrays.toString(arr));
		
		int sum = sumOf(arr);
		System.out.println("�迭�� ��� ���� " + sum + "�Դϴ�.");
	}
	
}

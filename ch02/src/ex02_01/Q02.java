package ex02_01;
//�迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.

import java.util.Arrays;

public class Q02 {
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
		System.out.println(Arrays.toString(a));
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]��(��) a[" + (a.length-1-i) +"]�� ��ȯ�մϴ�." );
			swap(a, i, a.length - 1 - i);
		}
	}
	
	public static void main(String[] args) {		
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println("�迭�� �����߽��ϴ�.");
		System.out.println(Arrays.toString(arr));
		System.out.println("��ȯ�� �����մϴ�..");
		reverse(arr);
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
}

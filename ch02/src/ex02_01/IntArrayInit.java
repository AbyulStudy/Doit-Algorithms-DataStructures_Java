package ex02_01;
// ���� ����� �ڷ����� int���� �迭 (���� ��ڼ��� 5 : new�� ���� ��ü�� ����)
public class IntArrayInit {
	public static void main(String[] args) {
		int[] score = {1,2,3,4,5}; // �迭 �ʱ��ڿ� ���� ����
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("a[" + i + "] = " + score[i]);
		}
	}
}

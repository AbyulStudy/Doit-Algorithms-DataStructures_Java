package ex02_01;
// ���� ����� �ڷ����� int���� �迭 (���� ��ڼ��� 5 : new�� ���� ��ü�� ����)
public class IntArray {
	public static void main(String[] args) {
		int[] score = new int[5]; // �迭�� ����
		
		score[1] = 37;
		score[2] = 51;
		score[4] = score[1] * 2; // score[1] * 2, �� 74�� ����
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("a[" + i + "] = " + score[i]);
		}
	}
}

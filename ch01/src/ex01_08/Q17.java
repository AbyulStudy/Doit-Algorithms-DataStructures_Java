package ex01_08;

public class Q17 {
 	/*
	n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
	 	4�� ����
	 	   1
	 	  222
	 	 33333
	 	4444444
	*/
	static void npria(int n) {
		// i �࿡ ����ϴ� ���ڴ� i % 10���� ���ϼ���. 
		// 2�ڸ� �̻��� ���� ���� ��� i�� ������ ���� �߻�
		for(int i = 1; i <= n; i++) {
			for(int y = n; y > i; y--) {
				System.out.print(' ');
			}
			for(int z = 1; z <= 2*(i-1) + 1; z++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		npria(11);
	}
}

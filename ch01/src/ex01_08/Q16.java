package ex01_08;

public class Q16 {
	/*
 	n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
	 	4�� ����
	 	   *
	 	  ***
	 	 *****
	 	*******
 	*/
	static void spira(int n) {
		// i �࿡�� (i - 1) * 2 + 1���� ��ȣ���� '*' �� ��µǰ� �ϼ���.
		// ������ n�࿡�� (n - 1) * 2 + 1 ���� ��ȣ ���� '*'�� ����ϰ� �˴ϴ�.
		for(int i = 1; i <= n; i++) {
			for(int y = n; y > i; y--) {
				System.out.print(' ');
			}
			for(int z = 1; z <= 2 * (i-1) + 1; z++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		spira(5);
	}
}

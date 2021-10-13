package ex01_08;

public class Q15 {
	// ���� �̵ �ﰢ���� ����ϴ� �κ��� triangleXX �޼���� �ۼ��ϼ���.

	// ���� �Ʒ��� ������ �̵ �ﰢ���� ���
	static void triangleLB(int n) {
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		for (int i = 0; i < n; i++) {
			for (int y = 0; y <= i; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	// ���� ���� ������ �̵ �ﰢ���� ���
	static void triangleLU(int n) {
		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�.");
		for(int i = 0; i < n; i++) {
			for(int y = 0; y < n-i; y++) {
				System.out.print('*');				
			}
			System.out.println();
		}
	}

	// ������ �Ʒ��� ������ �̵ �ﰢ���� ���
	static void triangleRB(int n) {
		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		for (int i = 0; i < n; i++) {
			for (int y = n; y > i+1; y--) {
				System.out.print(' ');
			}
			for(int z = 0; z <= i; z++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	// ������ ���� ������ �̵ �ﰢ���� ���
	static void triangleRU(int n) {
		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�.");
		for (int i = 0; i < n; i++) {
			for(int z = n; z > n-i; z--) {
				System.out.print(' ');
			}
			for(int y = 0; y < n-i; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		triangleLB(5);
		System.out.println("===============");
		triangleLU(5);
		System.out.println("===============");
		triangleRB(5);
		System.out.println("===============");
		triangleRU(5);
		System.out.println("===============");
	}
}

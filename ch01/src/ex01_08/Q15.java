package ex01_08;

public class Q15 {
	// 직각 이등변 삼각형을 출력하는 부분을 triangleXX 메서드로 작성하세요.

	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		for (int i = 0; i < n; i++) {
			for (int y = 0; y <= i; y++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	// 왼쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for(int i = 0; i < n; i++) {
			for(int y = 0; y < n-i; y++) {
				System.out.print('*');				
			}
			System.out.println();
		}
	}

	// 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
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
	
	// 오른쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
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

package ex01_08;

public class Q16 {
	/*
 	n단의 피라미드를 출력하는 메서드를 작성하세요.
	 	4단 예시
	 	   *
	 	  ***
	 	 *****
	 	*******
 	*/
	static void spira(int n) {
		// i 행에는 (i - 1) * 2 + 1개의 기호문자 '*' 가 출력되게 하세요.
		// 마지막 n행에는 (n - 1) * 2 + 1 개의 기호 문자 '*'를 출력하게 됩니다.
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

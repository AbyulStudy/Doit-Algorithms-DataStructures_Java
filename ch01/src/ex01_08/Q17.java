package ex01_08;

public class Q17 {
 	/*
	n단의 피라미드를 출력하는 메서드를 작성하세요.
	 	4단 예시
	 	   1
	 	  222
	 	 33333
	 	4444444
	*/
	static void npria(int n) {
		// i 행에 출력하는 숫자는 i % 10으로 구하세요. 
		// 2자리 이상의 수를 받을 경우 i로 받으면 에러 발생
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

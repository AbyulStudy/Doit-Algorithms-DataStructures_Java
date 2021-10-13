package ex01_07;

public class Q13 {
	public static void main(String[] args) {
		/* 
		   곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요.
			   |  1  2  3  4  5  6  7  8  9
			---+----------------------------
			 1 |  2  3  4  5  6  7  8  9 10
			 2 |  3  4  5  6  7  8  9 10 11
			 3 |  4  5  6  7  8  9 10 11 12
			 4 |  5  6  7  8  9 10 11 12 13
			 5 |  6  7  8  9 10 11 12 13 14
			 6 |  7  8  9 10 11 12 13 14 15
			 7 |  8  9 10 11 12 13 14 15 16
			 8 |  9 10 11 12 13 14 15 16 17
			 9 | 10 11 12 13 14 15 16 17 18
		 */
		System.out.print("   |");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+----------------------------");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%2d |",i);
			for(int y = 1; y < 10; y++) {
				System.out.printf("%3d",y+i);
			}
			System.out.println();
		}
	}
}

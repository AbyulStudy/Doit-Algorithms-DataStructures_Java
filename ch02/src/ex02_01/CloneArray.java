package ex02_01;

public class CloneArray {
	public static void main(String[] args) {
		int[] score = { 1, 2, 3, 4, 5 };
		int[] cloneArr = score.clone(); // cloneArr는 score의 복제를 참조

		cloneArr[3] = 0; // [3] 요소에만 0을 대입

		System.out.print("Score = ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(" " + score[i]);
		}

		System.out.print("\ncloneArr = ");
		for (int i = 0; i < cloneArr.length; i++) {
			System.out.print(" " + cloneArr[i]);
		}
		
		/* output             ↓
		 	   Score =  1 2 3 4 5
			cloneArr =  1 2 3 0 5
		 					  ↑
		 */
	}
}

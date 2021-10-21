package ex02_03;

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
		
		// 배열 cloneArr 은 score 배열의 복제를 참조 하도록 초기화 했습니다.
		// cloneArr[3] 을 바꾼뒤 모든 요소값을 확인 했을때 배열변수 cloneArr의 참조가 score배열의 본체 그 자체가 아니라 그 복제임을 확인 할수 있습니다.
	}
}

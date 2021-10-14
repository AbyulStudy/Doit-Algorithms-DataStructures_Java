package ex02_01;
// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는 5 : new에 의해 본체를 생성)
public class IntArray {
	public static void main(String[] args) {
		int[] score = new int[5]; // 배열의 선언
		
		score[1] = 37;
		score[2] = 51;
		score[4] = score[1] * 2; // score[1] * 2, 곧 74를 대입
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("a[" + i + "] = " + score[i]);
		}
	}
}

package ex02_01;
// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는 5 : new에 의해 본체를 생성)
public class IntArrayInit {
	public static void main(String[] args) {
		int[] score = {1,2,3,4,5}; // 배열 초기자에 의해 선언
		
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("a[" + i + "] = " + score[i]);
		}
	}
}

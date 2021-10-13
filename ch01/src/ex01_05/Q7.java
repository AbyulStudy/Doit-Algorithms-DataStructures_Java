package ex01_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q7 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String args[]) throws IOException {
		/* 
			�ǽ� 1-5 ���α׷��� �����Ͽ� n�� 7�̸� 
			'1 + 2 + 3 + 4 + 5 + 6 + 7 = 28' �� ����ϴ� ���α׷��� �ۼ��ϼ���.		
		*/
		int sum = 0;
		for(int i = 1 ; i <= 7; i++) {
			sum += i;
			bw.write(i+"");
			if(i < 7) {
				bw.write(" + ");
			}
			else {
				bw.write(" = " + sum + "\n");
			}
		}
		bw.flush();
	}
}

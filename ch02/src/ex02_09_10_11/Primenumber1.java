package ex02_09_10_11;
// 1,000 ������ �Ҽ��� ����(���� 1)

public class Primenumber1 {

	public static void main(String[] args) {
		int counter = 0;	// �������� Ƚ��
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for ( i = 2; i < n; i++) {
				counter++;
				if(n % i == 0) break;	// ������ �������� �Ҽ��� �ƴϹǷ� ���̻��� �ݺ��� ���ʿ�
			}
			if(n == i)	// ���������� ������ �������� ���� 
				System.out.println(n);
		}
		
		System.out.println("�������� ������ Ƚ��: " + counter);
	}

}

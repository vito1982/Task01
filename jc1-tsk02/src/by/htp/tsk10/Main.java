//	� ������� ��������� while �������� ��������� ������ ���� ������ ����� � ���������
//	�� 2 �� 100 ������������.

package by.htp.tsk10;

public class Main {
	public static void main(String[] args) {
		int x = 2;
		
		while(x <= 100) {
			if(x%2 == 0) {
				System.out.print(x + " ");
			}
			x++;
		}
	}
}

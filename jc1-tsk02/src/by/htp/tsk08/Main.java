//	������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������,
//	������� �� ������ ����� ���������.

package by.htp.tsk08;

public class Main {
	public static void main(String[] args) {
		int A = 10, B = 20;
		int x = 20, y = 15, z = 10;
		int a1 = 0, b1 = 0;
		
		//������� ���������� ������� �������
		if(x < y) {
			a1 = x;
			if(y < z) {
				b1 = y;
			} else b1 = z;
		}else {
			a1 = y;
			if(x < z) {
				b1 = x;
			} else b1 = z;
		}
		
		//System.out.println(a1 + " - " + b1);
		
		if(a1 <= A && b1 <= B) {
			System.out.println("������ �������.");
		} else {
			if(a1 <= B && b1 <= A) {
				System.out.println("������ �������.");
			} else System.out.println("������ �� �������.");
		}
		
	}
}

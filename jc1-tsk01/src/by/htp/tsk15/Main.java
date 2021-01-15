//	��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] �
//	����� h. ��������� ����������� � ���� �������, ������ ������� ������� � ��������
//	���������, ������ - ��������������� �������� �������:
//	F(x) = 2*tg(x/2) + 1

package by.htp.tsk15;

public class Main {
	public static void main(String[] args) {
		double a = 2.0, b = 5.0, h = 0.2, x;
		
		for(double i = a; i <= b; i = i + h) {
			x = 2*Math.tan(i/2) + 1;
			System.out.println(i + "\t - \t" + x);
		}
	}
}

//	��������� �������� �������:
//	F(x) = 9, ���� x <= -3; F(x) = 1 / (x*x + 1), ���� x > 3;

package by.htp.tsk17;

public class Main {

	public static void main(String[] args) {
		double x = 3.1, y;
		
		if(x <= -3) {
			y = 9;
			System.out.println("F(x) = " + y);
		} else if (x > 3) {
			y = 1 / (x*x +1);
			System.out.println("F(x) = " + y);
		} else {
			System.out.println("'x' �� �������� ��� �������");
		}
	}

}

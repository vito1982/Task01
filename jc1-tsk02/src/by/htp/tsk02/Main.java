//	Вычислить значение выражения по формуле (все переменные принимают действительные
//	значения): a/c * b/d - (a*b - c) / c*d

package by.htp.tsk02;

public class Main {
	public static void main(String[] args) {
		double a, b, c, d;
		double x;
		
		a = 2.6; b = 3.8; c = 4.1; d = 5.7;
		
		x = a/c * b/d - (a*b - c) / c*d;
		
		System.out.println("F(x) = " + x);
	}
}

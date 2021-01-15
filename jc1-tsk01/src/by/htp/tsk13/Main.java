//	Вычислить значение выражения по формуле (все переменные принимают
//	действительные значения):
//	a) (b + Math.sqrt(b*b + 4*a*c)) / 2*a - Math.pow(a, 3)*c + b
//	b) a/c * b/d - (a*b - c) / c*d;

package by.htp.tsk13;

public class Main {

	public static void main(String[] args) {
		double a = 2, b = 4, c = 6, d = 8, x;
		
		x = (b + Math.sqrt(b*b + 4*a*c)) / 2*a - Math.pow(a, 3)*c + b;
		
		System.out.println("F(x) = " + x);
		
		x = a/c * b/d - (a*b - c) / c*d;
		
		System.out.println("F(x) = " + x);
	}

}

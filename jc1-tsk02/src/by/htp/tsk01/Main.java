//	Вычислить значение выражения по формуле (все переменные принимают действительные
//	значения): ((b + Math.sqrt(b*b + 4*a*c) / 2*a) - a^3*c + b^-2

package by.htp.tsk01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double a, b, c;
		double x;
		
		a = 3.5;
		b = 8.7;
		c = 7.4;
		
		x = ((b + Math.sqrt(b*b + 4*a*c)) / (2*a)) - Math.pow(a, 3)*c + Math.pow(b, -2);
		
		System.out.println("F(x) = " + x);
	}
}

//	Программа запрашивает у пользователя a,b,c, вычислить значение выражения a^2 - (b-c)^2 + ln(b^2 +1).

package by.htp.tsk06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double a, b, c, x;
		
		a = entering('a');
		b = entering('b');
		c = entering('c');
		
		x = a*a - Math.pow((b - c), 2) + Math.log(b*b + 1);
		
		System.out.println("F(x) = " + x);
	}
	
	public static double entering(char c) {
		double t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter " + c + " -> ");
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		t = sc.nextDouble();
		
		return t;
	}
}

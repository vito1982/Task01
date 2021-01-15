//	Вычислить значение функции:
//		F(x) = x^2 - 3*x + 9, если x <= 3;
//		F(x) = 1 / (x^3 + 6), если x > 3;

package by.htp.tsk09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x, y = 0.0;
		
		x = enterX();
		
		if(x <= 3) {
			y = x*x - 3*x + 9;
		} else if (x > 3) {
			y = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println("F(x) = " + y);
	}
	
	public static double enterX() {
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Введите x -> ");
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();
		
		return x;
	}
	
}

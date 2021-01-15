//	Вычислить значения функции на отрезке [а,b] c шагом h:
//	F(x) = x, если x > 2
//	F(x) = -x, если x <= 2  

package by.htp.tsk11;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double x, y = 0.0, a, b, h;
		
		a = enterX('a');
		b = enterX('b');
		h = enterX('h');
		
		
		for(double i = a; i <= b; i += h) {
			if(i > 2) {
				y = i;
			} else if(i <= 2) {
				y = -i;
			}
			System.out.println(i + "  -  " + y);
		}
	}
	
	public static double enterX(char c) {
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print("Введите " + c + " -> ");
		
		while(!sc.hasNextDouble()) {
			sc.next();
		}
		x = sc.nextDouble();
		
		return x;
	}
}

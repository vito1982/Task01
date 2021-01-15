//	Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и
//	если да, то будет ли он прямоугольным.

package by.htp.tsk06;

import java.util.Scanner;

public class Main {
	static int t = 0;
	
	public static void main(String[] args) {
		int a, b, c;
		
		a = enterX();
		b = enterX();
		c = 180 - a - b;
		
		//System.out.println(a + " " + b + " " + c);
		
		if(c > 0) {
			System.out.println("Третий угол треугольника = " + c);
			System.out.println("\nТреугольник существует!");
			check(a, b, c);
		}else {
			System.out.println("\nТреугольник НЕ существует!");
		}
	}
	
	public static int enterX() {
		Scanner sc = new Scanner(System.in);
		int x;
		t++;
		
		switch (t){
			case 1:
				System.out.print("Введите первый угол треугольника -> ");
				break;
			
			case 2:
				System.out.print("Введите второй угол треугольника -> ");
				break;
			
			default:
				break;
		}
		
		while(!sc.hasNextInt()) {
			sc.next();
		}
		x = sc.nextInt();
		
		return x;
	}
	
	public static void check(int a, int b, int c) {
		if(a == 90 || b == 90 || c == 90) {
			System.out.println("Треугольник прямоугольный");
		}
	}
}

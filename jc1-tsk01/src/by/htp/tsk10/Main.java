//	Программа вводит количество чисел N, а затем N вещественных чисел. Программа
//	усекает вещественные числа и определяет, сколько среди усеченных чисел четных
//	и > 15.

package by.htp.tsk10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c, kol = 0, big = 0;
		
		System.out.print("Введите количество чисел: ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		c = sc.nextInt();
		
		for(int i = 1; i <= c; i++) {
			double a = 0.0;
			int x;
			
			System.out.print("Введите " + i + " число -> ");
			while(!sc.hasNextDouble()) {
				sc.next();
			}
			a = sc.nextDouble();
			
			x = (int) a;
			
			if(x%2 == 0) kol++;
			if(x > 15) big++;
		}
		
		System.out.println("Количество четных: " + kol);
		System.out.println("Количество >15" + big);
	}

}

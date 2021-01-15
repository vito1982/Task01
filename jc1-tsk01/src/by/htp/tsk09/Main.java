//	Программа запрашивает количество чисел, затем вводит целые числа в соответствии
//	с указанным количеством. Определяет количество четных, сумму кратных 3-м и
//	количество чисел, модуль которых <3

package by.htp.tsk09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, kch = 0, skr = 0, km = 0;
		
		System.out.print("Введите количество чисел: ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();
		
		for(int i = 0; i < k; i++) {
			int x;
			System.out.print("Введите " + (i+1) + " число: ");
			while(!sc.hasNextInt()) {
				sc.next();
			}
			x = sc.nextInt();
			
			if(x%2 == 0) {
				kch++;
			}
			if(x%3 == 0) {
				skr += x;
			}
			if(Math.abs(x) < 3) {
				km++;
			}
		}
		
		System.out.println("Количество четных = " + kch);
		System.out.println("Суммы кратны 3 = " + skr);
		System.out.println("Модуль < 3 = " + km);
	}
}

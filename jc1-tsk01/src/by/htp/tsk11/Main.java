//	Программа запрашивает количество чисел, вводит целые числа в соответствии с
//	заявленным количеством ,определяет, сколько чисел больше 15 или <2, чему равна
//	сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.

package by.htp.tsk11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, big = 0, sml = 0, sum = 0;
		
		System.out.print("Введите количество чисел -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();
		
		for(int i = 1; i <= k; i++) {
			int x;
			
			System.out.print("Введите " + i + " число -> ");
			while(!sc.hasNextInt()) {
				sc.next();
			}
			x = sc.nextInt();
			
			if(x > 15) {
				big++;
			}
			if(x < 2) {
				sml++;
			}
			if(x%5 == 4) {
				sum += x;
			}
		}
		
		System.out.println("Количество чисел >15: " + big);
		System.out.println("Количество чисел <2: " + sml);
		System.out.println("Сумма чисел делимых на 5 с остатком 4: " + sum);
	}

}

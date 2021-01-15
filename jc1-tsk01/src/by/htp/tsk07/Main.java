//	Программа вводит два числа a и b, если а > b, то программа вводит третье число с и
//	находит сумму b+c. Если а=b, то программа печатает слово «Конец». Если а<b, то
//	программа вводит третье число с, находит сумму a+b+c, выводит на экран сумму
//	a+b+c и слова «Новый год!».

package by.htp.tsk07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c, x;
		
		a = enter('a');
		b = enter('b');
		
		if(a > b) {
			c = enter('c');
			x = b + c;
			System.out.println("x = " + x);
		} else if(a == b) {
			System.out.println("Конец");
		} else if(a < b) {
			c = enter('c');
			x = a + b + c;
			System.out.println("x = " + x + "\nНовый год!");
		}
		
	}
	
	public static int enter(char c) {
		int t = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter " + c + " -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		t = sc.nextInt();
		
		return t;
	}
}

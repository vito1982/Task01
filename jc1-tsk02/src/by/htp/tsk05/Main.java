//	Составить программу: определения наименьшего из двух чисел а и b.

package by.htp.tsk05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		
		a = enterX('a');
		b = enterX('b');
		
		if(a < b) System.out.println("Наименьшее число - " + a);
		else System.out.println("Наименьшее число - " + b);
	}
	
	public static int enterX(char c) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("Введите " + c + " -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		x = sc.nextInt();
		
		return x;
	}
}

//	Найти НОД двух целых положительных чисел.

package by.htp.tsk15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		
		a = enterX('a');
		b = enterX('b');
				
		noD(a,b);
	}
	
	public static int enterX(char c) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите " + c + " -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		x = sc.nextInt();
		
		return x;
	}
	
	public static void noD(int a, int b) {
		int x = 1;
		if(a < b) {
			for(int i = 1; i <= a; i++) {
				if(a%i == 0 && b%i == 0) {
					x = i;
				}
			}
		}else {
			for(int i = 1; i <= b; i++) {
				if(a%i == 0 && b%i == 0) {
					x = i;
				}
			}
		}
		
		System.out.println("НОД чисел " + a + " и " + b + " = " + x);
	}
		
}

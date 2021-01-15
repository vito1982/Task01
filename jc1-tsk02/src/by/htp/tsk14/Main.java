//	Требуется определить факториал числа, которое ввел пользователь.

package by.htp.tsk14;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		BigInteger x = BigInteger.ONE;
		
		System.out.print("Введите число -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();
		
		if(a != 0) {
			for(int i = 1; i <= a; i++) {
				x = x.multiply(BigInteger.valueOf(i));
			}
		}
		
		System.out.println("Факториал числа " + a + " = " + x);
	}
}

//	��������� ���������: ����������� ����������� �� ���� ����� � � b.

package by.htp.tsk05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		
		a = enterX('a');
		b = enterX('b');
		
		if(a < b) System.out.println("���������� ����� - " + a);
		else System.out.println("���������� ����� - " + b);
	}
	
	public static int enterX(char c) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("������� " + c + " -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		x = sc.nextInt();
		
		return x;
	}
}

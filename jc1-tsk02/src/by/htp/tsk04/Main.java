//	��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� �����
//	7, � ��������� ������ � ����� 8.

package by.htp.tsk04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		
		a = enterX('a');
		b = enterX('b');
		
		if(a < b) System.out.println("7");
		else System.out.println("8");
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

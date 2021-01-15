//	��������� ������ ��� ����� a � b, ���� a=b, �� ������� �� ����� ����� ������ �����
//	���!�, � ��������� ������ ������ ������ ����� � � ������� �� ����� 3 ������ :
//	-�������� ��������� a+b+c
//	-�������� ��������� a^2 + b^2
//	-���� ������� ���������� �������

package by.htp.tsk08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		a = enter('a');
		b = enter('b');
		
		if(a == b) {
			System.out.println("C���� ����� ���!");
		} else {
			int c, x;
			
			c = enter('c');
			
			x = a + b + c;
			System.out.println("F(x) = " + x);
			
			x = a*a + b*b;
			System.out.println("F(x) = " + x);
			
			System.out.println("��� ������� ���������� �������.");
		}
	}
	
	public static int enter(char c) {
		Scanner sc = new Scanner(System.in);
		
		int t;
		
		System.out.print("Enter " + c + " -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		t = sc.nextInt();
		
		return t;
	}

}

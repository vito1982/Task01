//	��������� ������ ��� ����� a � b, ���� � > b, �� ��������� ������ ������ ����� � �
//	������� ����� b+c. ���� �=b, �� ��������� �������� ����� �������. ���� �<b, ��
//	��������� ������ ������ ����� �, ������� ����� a+b+c, ������� �� ����� �����
//	a+b+c � ����� ������ ���!�.

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
			System.out.println("�����");
		} else if(a < b) {
			c = enter('c');
			x = a + b + c;
			System.out.println("x = " + x + "\n����� ���!");
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

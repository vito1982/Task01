//	�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. �
//	��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.

package by.htp.tsk13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0, x = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������� ����� -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			x += i;
		}
		
		System.out.println("��������� = " + x);
	}
}

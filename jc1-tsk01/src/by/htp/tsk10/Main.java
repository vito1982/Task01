//	��������� ������ ���������� ����� N, � ����� N ������������ �����. ���������
//	������� ������������ ����� � ����������, ������� ����� ��������� ����� ������
//	� > 15.

package by.htp.tsk10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c, kol = 0, big = 0;
		
		System.out.print("������� ���������� �����: ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		c = sc.nextInt();
		
		for(int i = 1; i <= c; i++) {
			double a = 0.0;
			int x;
			
			System.out.print("������� " + i + " ����� -> ");
			while(!sc.hasNextDouble()) {
				sc.next();
			}
			a = sc.nextDouble();
			
			x = (int) a;
			
			if(x%2 == 0) kol++;
			if(x > 15) big++;
		}
		
		System.out.println("���������� ������: " + kol);
		System.out.println("���������� >15" + big);
	}

}

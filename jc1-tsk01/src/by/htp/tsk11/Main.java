//	��������� ����������� ���������� �����, ������ ����� ����� � ������������ �
//	���������� ����������� ,����������, ������� ����� ������ 15 ��� <2, ���� �����
//	����� �����, ������� ������� �� 5 � �������� 4. ��������� ������� �� �����.

package by.htp.tsk11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, big = 0, sml = 0, sum = 0;
		
		System.out.print("������� ���������� ����� -> ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();
		
		for(int i = 1; i <= k; i++) {
			int x;
			
			System.out.print("������� " + i + " ����� -> ");
			while(!sc.hasNextInt()) {
				sc.next();
			}
			x = sc.nextInt();
			
			if(x > 15) {
				big++;
			}
			if(x < 2) {
				sml++;
			}
			if(x%5 == 4) {
				sum += x;
			}
		}
		
		System.out.println("���������� ����� >15: " + big);
		System.out.println("���������� ����� <2: " + sml);
		System.out.println("����� ����� ������� �� 5 � �������� 4: " + sum);
	}

}

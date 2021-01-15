//	��������� ����������� ���������� �����, ����� ������ ����� ����� � ������������
//	� ��������� �����������. ���������� ���������� ������, ����� ������� 3-� �
//	���������� �����, ������ ������� <3

package by.htp.tsk09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, kch = 0, skr = 0, km = 0;
		
		System.out.print("������� ���������� �����: ");
		while(!sc.hasNextInt()) {
			sc.next();
		}
		k = sc.nextInt();
		
		for(int i = 0; i < k; i++) {
			int x;
			System.out.print("������� " + (i+1) + " �����: ");
			while(!sc.hasNextInt()) {
				sc.next();
			}
			x = sc.nextInt();
			
			if(x%2 == 0) {
				kch++;
			}
			if(x%3 == 0) {
				skr += x;
			}
			if(Math.abs(x) < 3) {
				km++;
			}
		}
		
		System.out.println("���������� ������ = " + kch);
		System.out.println("����� ������ 3 = " + skr);
		System.out.println("������ < 3 = " + km);
	}
}

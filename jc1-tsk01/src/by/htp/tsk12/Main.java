//	������� ��������� ����� ����� ����� ��� ���������� ��������� ������, ��������
//	�� ����� � ������ ���������� �� �������.

package by.htp.tsk12;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		
		if(args.length == 0) {
			System.out.println("���������� ���!");
		}else {
			for(String i : args) {
				x += Integer.parseInt(i);
			}
			
			System.out.println("����� ���������� = " + x);
		}
	}
}

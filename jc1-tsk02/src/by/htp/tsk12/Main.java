//	Вывести на экран соответствий между символами и их численными обозначениями в
//	памяти компьютера (Таблицу ASCII).

package by.htp.tsk12;

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i < 255; i++) {
			char c = (char)i;
			System.out.print(i + " : " + c + "\t\t");
			if (i%10 == 0) System.out.println();
		}
	}
}

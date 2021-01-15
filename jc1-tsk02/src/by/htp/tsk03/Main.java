//	Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные
//	единицы измерения информации.

package by.htp.tsk03;

public class Main {
	public static void main(String[] args) {
		int A = 25465845;
		double x;
		
		System.out.println("Byte = " + A);
		
		x = (double)A / 1024;
		System.out.println("KByte = " + x);
		
		x = x / 1024;
		System.out.println("MByte = " + x);
		
		x = x / 1024;
		System.out.println("GByte = " + x);
	}
}

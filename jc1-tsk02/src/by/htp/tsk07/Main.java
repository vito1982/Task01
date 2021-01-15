//	ѕодсчитать количество отрицательных среди чисел а, b, с.

package by.htp.tsk07;

public class Main {
	public static void main(String[] args) {
		int a = 2, b = -5, c = -8;
		int x = 0;
		
		if (a < 0) x++;
		if (b < 0) x++;
		if (c < 0) x++;
		
		System.out.println(" оличество отрицательных чисел = " + x);
	}
}

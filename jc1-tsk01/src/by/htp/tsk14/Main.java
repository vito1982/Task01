//	Даны три действительных числа. Возвести в квадрат те из них, значения которых
//	неотрицательны, и в четвертую степень — отрицательные.

package by.htp.tsk14;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 3; a[1] = 4; a[2] = -5;
		
		for(int i : a) {
			if(i > 0) {
				System.out.println("F(x > 0) = " + Math.pow(i, 2));
			} else if(i < 0) {
				System.out.println("F(x < 0) = " + Math.pow(i, 4));
			}
			
		}
	}
}

//	Напишите программу нахождения гипотенузы и площади прямоугольного
//	треугольника по двум катетам.

package by.htp.tsk04;

public class Main {
	public static void main(String[] args) {
		double a = 3, b = 4, c, S;
		
		c = Math.sqrt(a*a + b*b);
		System.out.println("Gipotenuza: " + c);
		
		S = a*c / 2;
		System.out.println("Ploshad: " + S);
	}
}

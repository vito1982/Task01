//	Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

package by.htp.tsk16;

public class Main {

	public static void main(String[] args) {
		double R = 5, D, S;
		
		D = 2 * Math.PI * R;
		System.out.println("Длина окружности = " + D);
		
		S = Math.PI * Math.pow(R, 2);
		System.out.println("Радиус окружности = " + S);
	}

}

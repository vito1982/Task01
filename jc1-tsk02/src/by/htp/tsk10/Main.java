//	С помощью оператора while напишите программу вывода всех четных чисел в диапазоне
//	от 2 до 100 включительно.

package by.htp.tsk10;

public class Main {
	public static void main(String[] args) {
		int x = 2;
		
		while(x <= 100) {
			if(x%2 == 0) {
				System.out.print(x + " ");
			}
			x++;
		}
	}
}

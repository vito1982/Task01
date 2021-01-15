//	Создать программу ввода целых чисел как аргументов командной строки, подсчета
//	их суммы и вывода результата на консоль.

package by.htp.tsk12;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		
		if(args.length == 0) {
			System.out.println("јргументов нет!");
		}else {
			for(String i : args) {
				x += Integer.parseInt(i);
			}
			
			System.out.println("—умма аргументов = " + x);
		}
	}
}

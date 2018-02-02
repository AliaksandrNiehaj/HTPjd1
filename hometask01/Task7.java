package by.htp.jd1.unit1.hometask;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, d = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите числовое значение переменной a: ");
		
		while(sc.hasNext()) {
			if(sc.hasNextDouble()) {
				a = sc.nextDouble();
				break;
			}
			else {
				System.out.print("Необходимо ввести число либо значение действительного числа через запятую: ");
				String str = sc.next();
			}
		}
		
		System.out.print("Введите числовое значение переменной b: ");
		
		while(sc.hasNext()) {
			if(sc.hasNextDouble()) {
				b = sc.nextDouble();
				break;
			}
			else {
				System.out.print("Необходимо ввести число либо значение действительного числа через запятую: ");
				String str = sc.next();
			}
		}
		
		System.out.print("Введите числовое значение переменной c: ");
		
		while(sc.hasNext()) {
			if(sc.hasNextDouble()) {
				c = sc.nextDouble();
				break;
			}
			else {
				System.out.print("Необходимо ввести число либо значение действительного числа через запятую: ");
				String str = sc.next();
			}
		}
		
		System.out.print("Введите числовое значение переменной d: ");
		
		while(sc.hasNext()) {
			if(sc.hasNextDouble()) {
				d = sc.nextDouble();
				break;
			}
			else {
				System.out.print("Необходимо ввести число либо значение действительного числа через запятую: ");
				String str = sc.next();
			}
		}
		
		double res = ((a/c) * (b/d))-((a*b-c)/(c*d));
		
		System.out.println("");
		System.out.println("Результат вычисления: " + res);
	}
}

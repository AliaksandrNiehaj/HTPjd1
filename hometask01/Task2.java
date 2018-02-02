package by.htp.jd1.unit1.hometask;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.log;

public class Task2 {
	public static void main(String[] args) {
		
		double a=0, b=0, c=0;
		double res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите значение переменной a: ");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				break;
			}
			else {
				System.out.println("Необходимо ввести числовое значение.");
				String s = sc.next();
			}
		}
		
		System.out.println("Введите значение переменной b: ");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
				break;
			}
			else {
				System.out.println("Необходимо ввести числовое значение.");
				String s = sc.next();
			}
		}
		
		System.out.println("Введите значение переменной c: ");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
				break;
			}
			else {
				System.out.println("Необходимо ввести числовое значение.");
				String s = sc.next();
			}
		}
				
		res = (int)((pow(a,2) - (pow(b,2) - 2*b*c + pow(c,2)) + log(pow(b,2) + 1))*1000);
		res = res/1000;
		System.out.println("Результат вычисления: " + res);
	}
}
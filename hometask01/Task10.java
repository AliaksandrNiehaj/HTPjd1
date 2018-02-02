package by.htp.jd1.unit1.hometask;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		double x = 0, f = 9;
		double res;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите значение x: ");
		while (sc.hasNext()) {
			if (sc.hasNextDouble()) {
				x = sc.nextDouble();
				break;
			}
			else {
				System.out.print("ВВедите числовое значение: ");
				String str = sc.next();
			}
		}
		
		System.out.println();
		
		if (x <= -3) {
			System.out.println("F(x) = " + f);
		}
		else if (x > 3) {
			res = (int)((1/(Math.pow(x, 2) + 1))*100000);
			res = res/100000;
			System.out.println("F(x) = " + res);
		}
		else {
			System.out.println("С данным аргументом функция выполнена быть не может.");
		}
	}
}

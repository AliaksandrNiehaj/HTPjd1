package by.htp.jd1.unit1.hometask;

import java.util.Scanner;
import static java.lang.Math.random;

public class Task4 {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число:");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				System.out.println(a);
				break;
			}
			else {
				System.out.println("Введите число!");
				String str = sc.next();
			}
		}
		
		System.out.println("Введите второе число:");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
				System.out.println(b);
				break;
			}
			else {
				System.out.println("Введите число!");
				String str = sc.next();
			}
		}
		
		if (a == b) {
			System.out.println("скоро Новый Год!");
		}
		else {
			System.out.println("Введите третье число:");
			while(sc.hasNext()) {
				if (sc.hasNextDouble()) {
					c = sc.nextDouble();
					System.out.println(c);
					break;
				}
				else {
					System.out.println("Введите число!");
					String str = sc.next();
				}
			}
			System.out.println("a+b+c = " + (a+b+c));
			System.out.println("a^2 + b^2 = " + ((a*a) + (b*b)));
			System.out.println("Моя любимая футбольная команда");
		}
	}
}
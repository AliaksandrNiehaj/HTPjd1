package by.htp.jd1.unit1.hometask;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		double a = 0, b = 0, h = 0;
		double[] mass;
		int kolMass;
		double znArg, res;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите значение начала отрезка: ");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
				break;
			}
			else {
				System.out.print("Введите число: ");
				String s = sc.next();
			}
		}
		
		System.out.print("Введите значение конца отрезка: ");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				double vrB = sc.nextDouble();
				if (vrB > a) {
					b = vrB;
					break;
				}
				else {
					System.out.print("Значение конца отрезка не может быть меньше либо равно его началу: ");
				}
			}
			else {
				System.out.print("Введите число: ");
				String s = sc.next();
			}
		}
		
		double lenOtr = b - a;
		System.out.println("Длина отрезка равна: " + lenOtr);
		
		System.out.print("Введите значение шага: ");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				double vrH = sc.nextDouble();
				if (vrH <= lenOtr && vrH > 0) {
					h = vrH;
					System.out.println("Шаг = " + h);
					break;
				}
				else {
					System.out.print("Значение шага не может быть меньше либо равно нулю и больше длины отрезка: ");
				}
			}
			else {
				System.out.print("Введите число: ");
				String s = sc.next();
			}
		}
		
		kolMass = (int) (lenOtr/h);
		System.out.println();
				
		mass = new double[kolMass];
		
		znArg = 0 + a;
		
		for (int i = 0; i < mass.length; i++) {
			double vrMass = znArg;
			System.out.print("x = " + vrMass + "   ");
			mass[i] = vrMass;
			res = (2*(Math.tan(vrMass/2)))+1;
			res = (int) (res*1000);
			res = res/1000;
			System.out.println("F(x) = " + res);
			znArg += h;	
		}
	}
}

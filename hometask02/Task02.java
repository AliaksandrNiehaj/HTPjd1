package by.htp.jd1.unit2.hometask02;

import java.util.Scanner;

public class Task02 {
	public static void main (String[] args) {
		double[] masDoub = new double[10];
		double max, min;
		int ind = 0;
		
		Scanner sc = new Scanner (System.in);
	
		max = masDoub[0];

		System.out.print("Заполните массив вещественными числами: ");
		for (int i = 0; i < masDoub.length; i++) {
			while (sc.hasNext()) {
				if (sc.hasNextDouble()) {
					masDoub[i] = sc.nextDouble();
					break;
				}
				else {
					System.out.println("Введите число: ");
					String str = sc.next();
				}
			}
		}
		
		System.out.println();
		for(int i = 0; i < masDoub.length; i++) {
			System.out.print(masDoub[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < masDoub.length; i++) {
			if (masDoub[i] > max) {
				max = masDoub[i];
			}
		}
		System.out.println("Самое большое число в массиве " + max);
		
		min = masDoub[0];
		
		for (int i = 0; i < masDoub.length; i++) {
			if (masDoub[i] < min) {
				min = masDoub[i];
				ind = i;
			}
		}
		System.out.println("Самое маленькое число в массиве " + min + ". Индекс " + ind);
		
		for (int i = 0; i < masDoub.length - 1; i++) {
			int minimal = i;
			for (int j = i + 1; j < masDoub.length; j++) {
				if (masDoub[j] < masDoub[minimal]) {
					minimal = j;
				}
			}
			double tmp = masDoub[i];
			masDoub[i] = masDoub[minimal];
			masDoub[minimal] = tmp;
		}
		
		System.out.println();
		System.out.println("Результат сортировки массива методом прямого выбора:");
		for (int i = 0; i < masDoub.length; i++) {
			System.out.print(masDoub[i] + " ");
		}
	}
}
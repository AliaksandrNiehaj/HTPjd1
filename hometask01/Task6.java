package by.htp.jd1.unit1.hometask;

import java.util.Scanner;

public class Task6 {
	public static void main (String[] args) {
		int x = 0;
		double[] massDoub;
		int[] massInt;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите целое число: ");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				int a = sc.nextInt();
				if (a > 0) {
					x = a;
					break;
				}
				else {
					System.out.print("Наш массив не может иметь нулевой или отрицательный размер: ");
				}
			}
			else {
				System.out.print("Введите целое число: ");
				String str = sc.next();
			}
		}
		
		massDoub = new double[x];
		
		for (int i = 0; i < massDoub.length; i++) {
			double b = Math.random() * 100;
			System.out.print(b + " ");
			massDoub[i] = b;
		}
		
		System.out.println();
		
		massInt = new int[x];
		
		for(int i = 0; i < massInt.length; i++) {
			int c = (int) massDoub[i];
			System.out.print(c + " ");
			massInt[i] = c;			
		}
		
/*		int kolChetF = 0;
//		for (int i = 0; i < massInt.length; i++) {
//			if (massInt[i] % 2 == 0 && massInt[i] > 15) {
//				kolChetF += 1;
//			}
//		}
*/ 

// закомментированный выше код работает правильно при условии: четные + > 15
		
		int kolChet = 0;
		for (int i = 0; i < massInt.length; i++) {
			if (massInt[i] % 2 == 0) {
				kolChet += 1;
			}
		}
		
		int kolMorF = 0;
		for (int i = 0; i < massInt.length; i++) {
			if (massInt[i] > 15) {
				kolMorF += 1;
			}
		}
		
		System.out.println();
		
		System.out.println();
		System.out.printf("Количество четных чисел составляет: %s.", kolChet);
		
		System.out.println();
		System.out.printf("Количество чисел > 15 составляет: %s.", kolMorF);
	}
}

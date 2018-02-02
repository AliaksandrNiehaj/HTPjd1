package by.htp.jd1.unit1.hometask;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		double[] veschCh = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < veschCh.length; i++) {
			int n = i+1;
			System.out.printf("Введите число %s: " ,n);
			while(sc.hasNext()) {
				if (sc.hasNextDouble()) {
					double a = sc.nextDouble();
					veschCh[i] = a;
					break;
				}
				else {
					System.out.println("Введите числовое значение через запятую: ");
					String str = sc.next();
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < veschCh.length; i++) {
			if (veschCh[i] >= 0) {
				int n = i + 1;
				double a = Math.pow(veschCh[i], 2);
				System.out.printf("Значение числа %s во второй степени равно " + a + ".", n);
				System.out.println();
			}
			else {
				int n = i + 1;
				double a = Math.pow(veschCh[i], 4);
				System.out.printf("Значение числа %s в четвертой степени равно " + a + ".", n);
				System.out.println("");
			}
		}
	}
}

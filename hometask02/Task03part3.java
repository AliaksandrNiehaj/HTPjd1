package by.htp.jd1.unit2.hometask02;

import java.util.Random;
import java.util.Scanner;

public class Task03part3 {
	public static void main (String[] args) {
		double[] arrayDejCh = null;
		int size;
		
		size = masSize();
		arrayDejCh = createMass(size);
		arrayDejCh = fillMass(arrayDejCh);
		readMass(arrayDejCh);
		System.out.println(getMassInfo(arrayDejCh));
		
	}
	
	public static int masSize() {
		int kolJach = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите число: ");
		
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int vrKol = sc.nextInt();
				if (vrKol > 1) {
					kolJach = vrKol;
					break;
				}
				else {
					System.out.println("Введите число не менее 2: ");
				}
			}
			else {
				System.out.print("Введите число: ");
				String str = sc.next();
			}
		}
		return kolJach;	
	}
	
	public static double[] createMass(int x) {
		double[] array = new double[x];
		return array;
	}
	
	public static void readMass(double[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static double[] fillMass(double[] array) {
		Random rand = new Random();
		double vrPer;
		
		for (int i = 0; i < array.length; i ++) {
			vrPer = (int)(rand.nextDouble()*1000);
			array[i] = vrPer/100;
		}
		return array;
	}
	
	public static String getMassInfo (double[] array) {
		int j = 1;
		String str;
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[j]) {
				j += 1;
			}
			else {
				break;
			}
		}
		if (j == array.length) {
			str = "Последовательность чисел является возрастающей.";
		}
		else {
			str = "Последовательность чисел не является возрастающей.";
		}
		return str;
	}
}
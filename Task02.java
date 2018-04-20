package by.htp.jd1.unit3.hometask03;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
	public static void main (String[] args) {
		
		int sizeH, sizeV;
		int[][] arrayW = null;
		
		System.out.print("Введите количество строк массива: ");
		sizeH = massGab();
		System.out.print("Введите количество стобцов массива: ");
		sizeV = massGab();
		arrayW = createArray(sizeH, sizeV);
		
		fillArray(arrayW);
		readArray(arrayW);
		
		System.out.println();
		
		changeArray(arrayW);
		readArray(arrayW);
		
	}
	
	public static int massGab () {
		int size = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int vrI = sc.nextInt();
				if (vrI > 1) {
					size = vrI;
					break;
				}
				else {
					System.out.print("Введите число более единицы: ");
				}
			}
			else {
				System.out.print("Введите число: ");
				String str = sc.next();
			}
		}
		return size;
	}
	
	public static int[][] createArray (int x, int y) {
		int[][] array = new int[x][y];
		return array;
	}
	
	public static void readArray (int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " \t ");
			}
			System.out.println();
		}
	}
	
	public static int[][] fillArray (int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(100);
			}
		}
		return array;
	}
	
	public static int[][] changeArray(int[][] array) {
		int firstStrNum = 0;
		int secondStrNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Введите номера строк, которые Вы желаете поменять местами.");
		System.out.print("Введите номер первой строки числом: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int vrI = sc.nextInt();
				if (vrI >= 1 && vrI <= array.length) {
					firstStrNum = vrI;
					break;
				}
				else {
					System.out.print("Введите число, не превышающее количество строк в массиве: ");
				}
			}
			else {
				System.out.print("Введите номер первой строки числом: ");
				String str = sc.next();
			}
		}
		
		System.out.print("Введите номер второй строки числом: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int vrI = sc.nextInt();
				if ((vrI >= 1 && vrI <= array.length) && (vrI != firstStrNum)) {
					secondStrNum = vrI;
					break;
				}
				else {
					System.out.print("Введите число, не превышающее количество строк в массиве и не равное предыдущему: ");
				}
			}
			else {
				System.out.print("Введите номер первой строки числом: ");
				String str = sc.next();
			}
		}
		
		int[] tmp = null;
		firstStrNum -= 1;
		secondStrNum -= 1;
		
		for (int i = 0; i < array.length; i++) {
			if ((i == firstStrNum)) {
				tmp = array[firstStrNum];
				array[firstStrNum] = array[secondStrNum];
				array[secondStrNum] = tmp;				}
		}
	return array;
	}
}
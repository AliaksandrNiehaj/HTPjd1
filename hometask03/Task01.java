package by.htp.jd1.unit3.hometask03;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	public static void main (String[] args) {
		int size;
		int[][] array;
		int[] arrayTwo;
		
		size = sizeOfArray();
		array = createArray(size);
		array = fillArray(array);
		readArray(array);
		arrayTwo = maxArray(array, size);
		readArrayTwo(arrayTwo);
	}
	
	public static int sizeOfArray () {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				int vrX = sc.nextInt();
				if (vrX > 1) {
					x = vrX;
					break;
				}
				else {
					System.out.print("Введите значение более 2: ");
				}
			}
			else {
				System.out.print("Введите число: ");
				String str = sc.next();
			}
		}
		return x;
	}
	
	public static int[][] createArray(int len) {
		int[][] array = new int[len][len];
		return array;
	}
	
	public static void readArray (int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " \t ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void readArrayTwo (int[] array) {
		System.out.print("Самые большие числа в столбцах: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[][] fillArray (int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(20);
			}
		}
		return array;
	}
	
	public static int[] maxArray(int[][] array, int count) {
		int max = 0;
		int[] massMax = new int[count];
		
		for (int i = 0; i < count; i++) {
			max = array[0][i];
			for (int j = 0; j < count; j++) {
				if (array[j][i] > max) {
					max = array[j][i];
				}
			}
			massMax[i] = max;
		}
		return massMax;
	}
}
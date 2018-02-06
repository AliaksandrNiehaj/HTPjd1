package by.htp.jd1.unit2.hometask02;

import java.util.Random;
import java.util.Scanner;

public class Task03part1 {
	public static void main (String[] args) {
		int[] arrA = new int[10];
		int kr, summ;
		
		arrA = fillArray(arrA);
		readArray(arrA);
		kr = inputKratn();
		summ = findSum(arrA, kr);
	}
	
	public static int[] fillArray (int[] array) {
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
		}
		return array;
	}
	
	public static void readArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int inputKratn() {
		int kratn = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите кратное: ");
		
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				kratn = sc.nextInt();
				break;
			}
			else {
				System.out.println("Необходимо ввести число: ");
				String str = sc.next();
			}
		}
		System.out.println();
		return kratn;
	}
	
	public static int findSum (int[] array, int kr) {
		int sum = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] % kr == 0) {
				sum += array[i];
			}
		}
		System.out.printf("Сумма чисел, кратных %s, составляет %s.", kr, sum);
		return sum;
	}
}
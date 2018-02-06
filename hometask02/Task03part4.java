package by.htp.jd1.unit2.hometask02;

import java.util.Random;

public class Task03part4 {
	public static void main (String[] args) {
		
		int[] massNatFirst;
		int[] massNatSecond = null;
		int sizeFirst, sizeSec;
		
		sizeFirst = 10;
		massNatFirst = createMass(sizeFirst);
		fillMass(massNatFirst);
		System.out.print("Массив 1: ");
		readMass(massNatFirst);
		
		sizeSec = kolChet(massNatFirst);
		massNatSecond = createMass(sizeSec);
		fillMassAut(massNatFirst, massNatSecond);
		System.out.print("Массив 2: ");
		readMass(massNatSecond);
		
	}
	
	public static int[] createMass(int x) {
		int[] array = new int[x];
		return array;
	}
	
	public static void readMass(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] fillMass(int[] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		return array;
	}
	
	public static int kolChet(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum += 1;
			}
		}
		if (sum == 0) System.out.println("В массиве нет четных чисел.");
		return sum;
	}
	
	public static int[] fillMassAut (int[] arrayA, int[] arrayB) {
		int temp;
		int summ = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % 2 == 0) {
				temp = arrayA[i];
				arrayB[summ] = temp;
				summ += 1;
			}
		}
		return arrayB;
	}
}
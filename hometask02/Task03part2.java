package by.htp.jd1.unit2.hometask02;

import java.util.Random;

public class Task03part2 {
	
	public static void main (String[] args) {
		
		int[] arrFirst;
		int[] arrSecond = null;
		int quantNull = 0;
		
		arrFirst = new int[25];
		arrFirst = fillArrByRandom(arrFirst);
		readArray(arrFirst);
		
		quantNull = kolNull(arrFirst);
		System.out.println();
		System.out.println("Количество нулей в массиве " + quantNull);
		
		arrSecond = createArr(arrSecond, quantNull);
		arrSecond = fillArrAut(arrFirst, arrSecond);
		readArray(arrSecond);
		
	}
	
	public static int[] fillArrByRandom (int[] array) {
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(10);
		}
		return array;
	}
	
	public static void readArray (int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int kolNull (int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				sum += 1;
			}
		}
		return sum;
	}
	
	public static int[] createArr (int[] array, int size) {
		array = new int[size];
		return array;
	}
	
	public static int[] fillArrAut (int[] arrayA, int[] arrayB) {
		int temp;
		int summI = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] == 0) {
				temp = i;
				arrayB[summI] = temp;
				summI += 1;
			}
		}
		return arrayB;
	}
}
package by.htp.jd1.unit3.hometask03;

import java.util.Random;

public class Task03TwoMatr {
	
	public static void main (String[] args) {
	
		int[][] arr1, arr2, arr3, arr4;
		
		arr1 = new int[2][2];
		arr2 = new int[2][2];
		arr3 = new int[arr1.length][arr2[0].length];
		arr4 = new int[arr1.length][arr2[0].length];
		
		arr1 = fillArray(arr1);
		arr2 = fillArray(arr2);
		arr3 = umnArrays(arr1, arr2);
		arr4 = slozhArrays(arr1, arr2);
		
		readArray(arr1);
		System.out.println();
		
		readArray(arr2);
		System.out.println();
		
		System.out.println("Матрица умножения:");
		readArray(arr3);
		System.out.println();
		
		System.out.println("Матрица сложения:");
		readArray(arr4);
	}
	
	public static void readArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " \t");
			}
			System.out.println();
		}
	}
	
	public static int[][] fillArray (int[][] array) {
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(7) + 2;
			}
		}
		return array;
	}
	
	public static int[][] umnArrays (int[][] array1, int[][] array2) {
		int[][] array = new int[array1.length][array2[0].length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++){
				for (int k = 0; k < array1[i].length; k++) {
					array[i][j] += array1[i][k] * array2[k][j];
				}
			}
		}
		return array;
	}
	
	public static int[][] slozhArrays (int[][] array1, int [][] array2) {
		int[][] array = new int[array1.length][array2[0].length];
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return array;
	}
}
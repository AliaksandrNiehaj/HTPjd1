package by.htp.jd1.unit3.hometask03;

import java.util.Random;
import java.util.Scanner;

public class Task03 {
	public static void main (String[] args) {
		
		int sizeH, sizeV;
		int sum = 0;
		int proizv = 0;
		int[][] array = null;
		
		System.out.print("Введите количество строк массива: ");
		sizeH = massGab();
		System.out.print("Введите количество стобцов массива: ");
		sizeV = massGab();
		array = createArray(sizeH, sizeV);
		
		fillArray(array);
		readArray(array);
		
		sum = findSumArrayEl(array);
		System.out.println("Сумма всех элементов массива = " + sum);
		
		proizv = findProizvArrayEl(array);
		System.out.println("Произведение всех элементов массива = " + proizv);
		
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
				array[i][j] = rand.nextInt(10);
			}
		}
		return array;
	}
	
	public static int findSumArrayEl (int[][] array) {
		int sum = 0;
		int x;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				x = array[i][j];
				sum += x;
			}
		}
		return sum;
	}
	
	public static int findProizvArrayEl (int[][] array) {
		int proizv = 1;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				proizv = array[i][j]*proizv;
			}
		}
		return proizv;
	}
}
package by.htp.jd1.unit1.hometask;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		int digitValue, x = 0;
		int[] digitArr;
		
		Scanner scDigit = new Scanner(System.in);
		System.out.print("Введите количество цифр: ");
		
		while(scDigit.hasNext()) {
			if (scDigit.hasNextInt()) {
				int a = scDigit.nextInt();
				if(a > 0) {
					x = a;
					break;
				}
				else {
					System.out.print("Необходимо ввести положительное число больше нуля: ");
					
				}
			}
			else {
				System.out.print("Необходимо ввести число: ");
				String s = scDigit.next();
			}
		}
		
		digitArr = new int[x];
		
		for(int i = 0; i < digitArr.length; i++) {
			int y = (int)(Math.random()*100);
//			int y = scDigit.nextInt(); //это, если захочется самому ввести (замедляет процесс)
			System.out.print(y + " ");
			digitArr[i] = y;
		}
		
		System.out.println("");
		
		int kolChet = 0;
		for(int i = 0; i < digitArr.length; i++) {
			if (digitArr[i] % 2 == 0) {
				kolChet += 1;
			}
		}
		System.out.println("Количество четных чисел: " + kolChet + ".");
		
		int summKrThree = 0;
		for (int i = 0; i < digitArr.length; i++) {
			if (digitArr[i] % 3 == 0) {
				summKrThree += digitArr[i];
			}
		}
		System.out.println("Сумма чисел, кратных трем: " + summKrThree + ".");
		
		int kolModThree = 0;
		for (int i = 0; i < digitArr.length; i++) {
			if (digitArr[i] < 3 && digitArr[i] > -3) {
				kolModThree += 1;
			}
		}
		System.out.println("Количество чисел с модулем менее трех: " + kolModThree + ".");
	}
}

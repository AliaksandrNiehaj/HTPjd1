package by.htp.jd1.unit3.hometask03;

import java.util.Scanner;

public class RepeatTask {
	
	public static void main (String[] args) {
		
		int x = 0;
		int y = 0;
		
		System.out.print("Введите значение x: ");
		x = getValue();
		System.out.print("Введите значение y: ");
		y = getValue();
		
		printResult(getTruth(x, y));
		
	}
	
	public static int getValue () {
		
		int per = 0;
		Scanner sc = new Scanner (System.in);
		
		while(sc.hasNext()) {
			if (sc.hasNextInt()) {
				per = sc.nextInt();
				break;
			}
			else {
				System.out.print("Введите число: ");
				String str = sc.next();
			}
		}
		return per;
	}
	
	public static boolean getTruth(int x, int y) {
		
		if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4) || (x >= -4 && x <= 4) && (y <= 0 && y >= -3)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void printResult(boolean bool) {
		if (bool == true) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
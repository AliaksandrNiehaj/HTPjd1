package by.htp.jd1.unit1.hometask;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Task1 {
	public static void main(String[] args) {
		double cat1 = 0;
		double cat2 = 0;
		double gip, sq;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите значение первого катета: ");
		while (scan.hasNext()) {
			if(scan.hasNextDouble()){
				double var1 = scan.nextDouble();
				if (var1 > 0){
					cat1 = var1;
					break;
				}
				else if (var1 == 0) {
					System.out.println("Катет не может быть равен нулю.");
				}
				else if (var1 < 0){
					System.out.println("Катет не может иметь отрицательное значение.");
				}
			}
			else{
				System.out.println("Значение катета должно быть числовым!");
				@SuppressWarnings("unused")
				String str = scan.next();
			}
		}
		
		System.out.println("Введите значение второго катета: ");
		while (scan.hasNext()) {
			if(scan.hasNextDouble()){
				double var2 = scan.nextDouble();
				if (var2 > 0){
					cat2 = var2;
					break;
				}
				else if (var2 == 0) {
					System.out.println("Катет не может быть равен нулю.");
				}
				else if (var2 < 0){
					System.out.println("Катет не может иметь отрицательное значение.");
				}
			}
			else {
				System.out.println("Значение катета должно быть числовым!");
				String str = scan.next();
			}
		}
				
		gip = (int)((sqrt(pow(cat1, 2)+pow(cat2, 2)))*1000);
		gip = gip/1000;
		sq = 0.5*cat1*cat2;
		
		System.out.println();
		System.out.println("Гипотенуза равна: " + gip);
		System.out.println("Площадь прямоугольного треугольника равна: " + sq);
	}
}
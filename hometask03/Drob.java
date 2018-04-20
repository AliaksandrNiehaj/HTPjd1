package by.htp.jd1.unit3.hometask03;

import java.util.Random;

public class Drob {
	public int numerator;
	public int denominator;
	
	public Drob() {
		numerator = 0;
		denominator = 1;
	}
	
	public Drob (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void readDrob() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public String getInfo() {
		return numerator + "/" + denominator;
	}
}

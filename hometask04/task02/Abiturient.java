package by.htp.jd1.unit4.hometask04.task02;

public class Abiturient {
	
	public String name;
	public String surName;
	public int ocenka;
	
	public Abiturient() {
	}
	
	public Abiturient(String name, String surName, int ocenka) {
		this.name = name;
		this.surName = surName;
		this.ocenka = ocenka;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getOcenka() {
		return ocenka;
	}

	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}
	
	public String getInfo() {
		String str = name + " " + surName + " " + ocenka;
		return str;
	}
}
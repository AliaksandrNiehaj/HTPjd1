package by.htp.jd1.unit4.hometask04.task01;

public class Student {
	
	public String name;
	public double ocenka1;
	public double ocenka2;
	double midOcSt;
	
	public Student () {
	}
	
	public Student (String name, int ocenka1, int ocenka2) {
		
		this.name = name;
		
		if (ocenka1 > 5) {
			ocenka1 = 5;
		}
		else if (ocenka1 < 1) {
			ocenka1 = 1;
		}
		this.ocenka1 = ocenka1;
		
		if (ocenka2 > 5) {
			ocenka2 = 5;
		}
		else if (ocenka2 < 1) {
			ocenka2 = 1;
		}
		this.ocenka2 = ocenka2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOcenka1() {
		return ocenka1;
	}

	public void setOcenka1(int ocenka1) {
		if (ocenka1 > 5) {
			ocenka1 = 5;
		}
		else if (ocenka1 < 1) {
			ocenka1 = 1;
		}
		this.ocenka1 = ocenka1;
	}
	
	public double getOcenka2() {
		return ocenka2;
	}

	public void setOcenka2(int ocenka2) {
		if (ocenka2 > 5) {
			ocenka2 = 5;
		}
		else if (ocenka2 < 1) {
			ocenka2 = 1;
		}
		this.ocenka2 = ocenka2;
	}
	
	public double getMidOcSt() {
		double middleBall = 0;
		middleBall = (((ocenka1 + ocenka2) / Group.KOL_OC)*100);
		middleBall = (int)middleBall;
		middleBall /= 100;
		return middleBall;
	}
	
	public static int findColOtl (Student[] array) {
		int col = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i].getOcenka1() == 5) && (array[i].getOcenka2()) == 5) {
				col += 1;
			}
		}
		return col;
	}
	
	public static int findColDvoechn (Student[] array) {
		int col = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i].getOcenka1() == 2) || (array[i].getOcenka2()) == 2) {
				col += 1;
			}
		}
		return col;
	}
	
}
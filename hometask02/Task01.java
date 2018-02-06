package by.htp.jd1.unit2.hometask02;

public class Task01 {
	public static void main (String[] args) {
		int[] mas = new int[]{4, -2, 18};
		int max = mas[0];
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) max = mas[i];
		}
		System.out.println(max);
	}
}

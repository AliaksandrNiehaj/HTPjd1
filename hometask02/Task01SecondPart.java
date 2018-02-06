package by.htp.jd1.unit2.hometask02;

public class Task01SecondPart {
	public static void main (String[] args) {
		int[] mas = new int[] {12, 11, 0, -6, 18, -190, 3};
		
		for (int i = 0; i < mas.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[min]) {
					min = j;
				}
			}
			int tmp = mas[i];
			mas[i] = mas[min];
			mas[min] = tmp;
		}
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}


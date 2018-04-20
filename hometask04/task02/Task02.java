package by.htp.jd1.unit4.hometask04.task02;

public class Task02 {
	
	public static void main (String[] args) {
		
		Abiturient[] abitur = new Abiturient[5];
		
		Abiturient ab1 = new Abiturient("Andrey", "Andreev", 201);
		abitur[0] = ab1;
		Abiturient ab2 = new Abiturient("Sergey", "Sergeev", 204);
		abitur[1] = ab2;
		Abiturient ab3 = new Abiturient("Nikita", "Nikitin", 199);
		abitur[2] = ab3;
		Abiturient ab4 = new Abiturient("Vladislav", "Vladov", 214);
		abitur[3] = ab4;
		Abiturient ab5 = new Abiturient("Nick", "Nickolaev", 207);
		abitur[4] = ab5;
		
		readArray(abitur);
		abitur = sortArray(abitur);
		System.out.println();
		getSpisPost(abitur, 3);
		
	}
	
	public static void readArray(Abiturient[] ab) {
		for (int i = 0; i < ab.length; i++) {
			System.out.println(ab[i].getInfo());
		}
	}
	
	public static Abiturient[] sortArray (Abiturient[] array) {
		Abiturient temp = null;
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].getOcenka() < array[j + 1].getOcenka()) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	
	public static String[] getSpisPost (Abiturient[] arr, int x) {
		String[] array = new String[x];
		
		System.out.println("Список поступивших:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = arr[i].getName() + " " + arr[i].getSurName();
			System.out.println(array[i]);
		}
		return array;
	}	
}
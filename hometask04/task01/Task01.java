package by.htp.jd1.unit4.hometask04.task01;

public class Task01 {

	public static void main(String[] args) {
		double midBallGr = 0;
		int colOtl = 0;
		int colDvoechn = 0;
		
		Student[] student = new Student[5];
		
		Student st1 = new Student("Alex", 3, 2);
		Student st2 = new Student("Nick", 4, 3);
		Student st3 = new Student("Igor", 5, 5);
		Student st4 = new Student("Stephania", 2, 4);
		Student st5 = new Student("Alexandr", 2, 5);
		
		student[0] = st1;
		student[1] = st2;
		student[2] = st3;
		student[3] = st4;
		student[4] = st5;
		
		midBallGr = Group.findMidOcGr(st1, st2, st3, st4, st5);
		System.out.println("Средний балл группы " + midBallGr);
		System.out.println();
		
		System.out.println("Средний балл " + st1.getName() + " составляет " + st1.getMidOcSt());
		System.out.println("Средний балл " + st2.getName() + " составляет " + st2.getMidOcSt());
		System.out.println("Средний балл " + st3.getName() + " составляет " + st3.getMidOcSt());
		System.out.println("Средний балл " + st4.getName() + " составляет " + st4.getMidOcSt());
		System.out.println("Средний балл " + st5.getName() + " составляет " + st5.getMidOcSt());
		System.out.println();
		
		colOtl = Student.findColOtl(student);
		System.out.println("Количество отличников " + colOtl);
		colDvoechn = Student.findColDvoechn(student);
		System.out.println("Количество двоечников " + colDvoechn);
	}
}

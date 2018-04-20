package by.htp.jd1.unit3.hometask03;

public class Task04 {
	public static void main (String[] args) {
		Student st1 = new Student(106, "Nefedov", "Oleg", "Arsentievich", "12.08.1995", "Minsk, Skripnikova str., 2, kv. 2", 297778822, "mechanic", 4);
		Student st2 = new Student();
		Student st3 = new Student("Soroka", "Andrey", "Viktorovich", "18.07.1997", 447585885);
		
		st2.setID(212);
		st2.setSurName("Prohorenko");
		st2.setName("Fedor");
		st2.setMiddleName("Sergeevich");
		st2.setBirthDate("11.07.1996");
		st2.setAdress("Vitebsk, Chkalova str., 28, kv. 44");
		st2.setPhone(335656532);
		st2.setFaculty("filologicheskiy");
		st2.setCourse(3);
		
		st3.setID(300);
		st3.setAdress("Brest, Lenina str., 17, kv. 87");
		st3.setFaculty("avto-traktorniy");
		st3.setCourse(2);
		
		st1.show();
		st2.show();
		st3.show();
		Student.getMoney();
		System.out.println();
		
		Customer cust1 = new Customer(231, "Bert", "Anders", "Valt", "Netherlands, Amsterdam", 24850021, 1274664633);
		Customer cust2 = new Customer(234, "Luchini", "Francho", "Antonio", "Italy, Bergamo", 24880121, 1279346369);
		
		cust1.show();
		cust2.show();
		
		Customer.getBankInfo();
	}
}

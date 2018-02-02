package by.htp.jd1.unit1.hometask;

import static java.lang.Math.random;

public class Task3 {
	public static void main(String[] args) {
		double a, b;
				
		a = random();
		a = a*10;
		System.out.println("a = " + a);
		
		b = random();
		b = b*10;
		System.out.println("b = " + b);
		
		if(a>b) {
			double c = random();
			c = c*10;
			double summ1 = b + c;
			System.out.println("Сумма b и c равна " + summ1 + "."); //судя по условию,
			//этой строки быть не должно, но я решил ее ввести,
			//чтобы было веселее получать и видеть результат.
			//Надеюсь, ошибкой это считаться не будет.
		}
		else if (a == b) {
			System.out.println("Конец");
		}
		else {
			double c = random();
			c = c * 10;
			double summ2 = a + b + c;
			System.out.println("Сумма трех значений равна " + summ2 + ". Новый Год!");
		}
	}
}

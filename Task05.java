package by.htp.jd1.unit3.hometask03;

public class Task05 {
	public static void main (String[] args) {
		Drob[] drobMass = new Drob[5];
		
		Drob dr1 = new Drob(7, 8);
		Drob dr2 = new Drob(2, 11);
		Drob dr3 = new Drob(12, 17);
		Drob dr4 = new Drob(2, 3);
		Drob dr5 = new Drob(1, 17);
		
		drobMass[0] = dr1;
		drobMass[1] = dr2;
		drobMass[2] = dr3;
		drobMass[3] = dr4;
		drobMass[4] = dr5;
		
		readArr(drobMass);
	}
	
	public static void readArr (Drob[] drob) {
		for (int i = 0; i < drob.length; i ++) {
			System.out.print(drob[i].getInfo() + " ");
		}
	}
}

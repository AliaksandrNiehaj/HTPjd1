package by.htp.jd1.unit4.hometask04.task01;

public class Group {
	private static int kolSt;
	public final static int KOL_OC = 2;
	private static double midOcGr;
	
	public static double findMidOcGr(Student... args) {
		double middleBallGr = 0;
		double x = 0;
		for (int i = 0; i < args.length; i++) {
			x = (args[i].getOcenka1() + args[i].getOcenka2())/KOL_OC;
			middleBallGr += x;
		}
		middleBallGr = (int)((middleBallGr / args.length) * 100);
		middleBallGr /= 100;
		return middleBallGr;
	}
}
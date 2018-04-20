package by.htp.jd1.unit5.hometask05.task01;

import java.util.Comparator;

public class BeginnerSetPrice implements Comparator<StationeryAbstract> {

	@Override
	public int compare(StationeryAbstract o1, StationeryAbstract o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		}
		if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		return 0;
	}

}

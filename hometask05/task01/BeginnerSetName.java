package by.htp.jd1.unit5.hometask05.task01;

import java.util.Comparator;

public class BeginnerSetName implements Comparator<StationeryAbstract> {

	@Override
	public int compare(StationeryAbstract o1, StationeryAbstract o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

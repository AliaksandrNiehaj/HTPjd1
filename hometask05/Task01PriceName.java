package by.htp.jd1.unit5.hometask05.task01;

import java.util.Comparator;
import java.util.TreeSet;

public class Task01PriceName {

	public static void main(String[] args) {
		
		Comparator<StationeryAbstract> mixComp = new BeginnerSetPrice().thenComparing(new BeginnerSetName());
		TreeSet<StationeryAbstract> priceNameSet = new TreeSet<StationeryAbstract>(mixComp);
		
		priceNameSet.add(new Pen("Ручка гелевая", 0.79));
		priceNameSet.add(new Pen("Ручка гелевая", 0.89));
		priceNameSet.add(new Pen("Ручка гелевая", 1));
		priceNameSet.add(new Scotch());
		priceNameSet.add(new ColorPaper());
		priceNameSet.add(new Pencil(0.79));
		priceNameSet.add(new Glue(1));
		
		for (StationeryAbstract pr : priceNameSet) {
			System.out.println(pr.getName() + ", " + pr.getPrice());
		}
		
	}

}

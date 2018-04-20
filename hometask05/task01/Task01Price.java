package by.htp.jd1.unit5.hometask05.task01;

import java.util.TreeSet;

public class Task01Price {
	
public static void main(String[] args) {
		
		BeginnerSetPrice begSetPr = new BeginnerSetPrice();
		TreeSet<StationeryAbstract> setName = new TreeSet<StationeryAbstract>(begSetPr);
		
		Pen pen1 = new Pen();
		Pen pen2 = new Pen(0.74);
		Pencil pencil1 = new Pencil();
		Pencil pencil2 = new Pencil(1.12);
		OfficePaper officePaper = new OfficePaper();
		PhotoPaper photoPaper1 = new PhotoPaper();
		PhotoPaper photoPaper2 = new PhotoPaper(5);
		ColorPaper colPaper = new ColorPaper();
		Glue glue = new Glue();
		Scotch scotch = new Scotch(0.15);
		
		setName.add(pen1);
		setName.add(pen2);
		setName.add(pencil1);
		setName.add(pencil2);
		setName.add(officePaper);
		setName.add(photoPaper1);
		setName.add(photoPaper2);
		setName.add(colPaper);
		setName.add(glue);
		setName.add(scotch);
		
		for (StationeryAbstract pr : setName) {
			System.out.println(pr.getName() + ", " + pr.getPrice());
		}	
	}
}
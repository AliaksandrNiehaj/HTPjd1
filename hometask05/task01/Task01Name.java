package by.htp.jd1.unit5.hometask05.task01;

import java.util.TreeSet;

public class Task01Name {
	
	public static void main(String[] args) {
		
		BeginnerSetName begSetName = new BeginnerSetName();
		TreeSet<StationeryAbstract> setPrice = new TreeSet<StationeryAbstract>(begSetName);
		
		Pen pen1 = new Pen("Ручка гелевая");
		Pen pen2 = new Pen("Ручка капиллярная", 0.74);
		Pencil pencil1 = new Pencil("Карандаш обычный");
		Pencil pencil2 = new Pencil("Карандаш супертонкий");
		OfficePaper officePaper = new OfficePaper();
		PhotoPaper photoPaper1 = new PhotoPaper();
		PhotoPaper photoPaper2 = new PhotoPaper("Фотобумага матовая", 5);
		ColorPaper colPaper = new ColorPaper();
		Glue glue = new Glue();
		Scotch scotch = new Scotch(0.15);
		
		setPrice.add(pen1);
		setPrice.add(pen2);
		setPrice.add(pencil1);
		setPrice.add(pencil2);
		setPrice.add(officePaper);
		setPrice.add(photoPaper1);
		setPrice.add(photoPaper2);
		setPrice.add(colPaper);
		setPrice.add(glue);
		setPrice.add(scotch);
		
		for (StationeryAbstract pr : setPrice) {
			System.out.println(pr.getName() + ", " + pr.getPrice());
		}	
	}	
}
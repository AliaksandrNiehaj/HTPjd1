package by.htp.jd1.unit5.hometask05.task01;

public abstract class WritingAbstract extends StationeryAbstract {
	
	private String corpMaterial;
	private String corpColor;
	
	public void writingNaim() {
		System.out.println("Writing");
	}
	public abstract void howToWrite();
	
	public void setCorpColor(String corpColor) {
		this.corpColor = corpColor;
	}
	
	public String getCorpColor() {
		return corpColor;
	}
	public String getCorpMaterial() {
		return corpMaterial;
	}
	public void setCorpMaterial(String corpMaterial) {
		this.corpMaterial = corpMaterial;
	}
	
}
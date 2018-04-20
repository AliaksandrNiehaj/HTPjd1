package by.htp.jd1.unit5.hometask05.task01;

public class Pencil extends WritingAbstract {
	
	private String corpMaterial;
	
	{
		corpMaterial = "Дерево";
		price = 0.5;
		name = "Карандаш";
	}
	
	public Pencil() {
	}
	
	public Pencil(String name) {
		this.name = name;
	}
	
	public Pencil(double price) {
		this.price = price;
	}
	
	public Pencil(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void howToWrite() {
		System.out.println("Карандаш пишет грифелем");
	}

	@Override
	public void stNaim() {
		System.out.println("Карандаш");
	}
	
	public void writeSomth(){
		System.out.println("Пишу что-либо грифелем");
	}
	
	public void writeSomth(String str){
		System.out.println("Пишу грифелем: " + str);
	}

	public String getCorpMaterial() {
		return corpMaterial;
	}

	public void setCorpMaterial(String corpMaterial) {
		this.corpMaterial = corpMaterial;
	}

	@Override
	public void getInfo() {
		System.out.println("Карандаш: " + this.getManufacturer() + " , " + this.getPrice());
	}
}
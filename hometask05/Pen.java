package by.htp.jd1.unit5.hometask05.task01;

public class Pen extends WritingAbstract {
	
	private String corpMaterial;
	
	{
		corpMaterial = "Пластик";
		price = 0.86;
		name = "Ручка";
	}
	
	public Pen() {
	}
	
	public Pen(String name) {
		this.name = name;
	}
	
	public Pen(double price) {
		this.price = price;
	}
	
	public Pen(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void howToWrite() {
		System.out.println("Ручка пишет стержнем");
	}

	@Override
	public void stNaim() {
		System.out.println("Ручка");
	}
	
	public void writeSomth(){
		System.out.println("Пишу что-либо стержнем");
	}
	
	public void writeSomth(String str){
		System.out.println("Пишу стержнем: " + str);
	}

	public String getCorpMaterial() {
		return corpMaterial;
	}

	public void setCorpMaterial(String corpMaterial) {
		this.corpMaterial = corpMaterial;
	}

	@Override
	public void getInfo() {
		System.out.println("Ручка: " + this.getManufacturer() + " , " + this.getPrice());
	}
}
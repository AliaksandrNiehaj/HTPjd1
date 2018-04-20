package by.htp.jd1.unit5.hometask05.task01;

public class Glue extends ConnectingAbstract {
	
	private String matCorp;
	
	{
		matCorp = "Пластик";
		price = 0.12;
		name = "Клей";
	}
	
	public Glue() {
	}
	
	public Glue(String name) {
		this.name = name;
	}
	
	public Glue(double price) {
		this.price = price;
	}
	
	public Glue(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void howToConnect() {
		System.out.println("Клей скрепляет клейким веществом");
	}

	@Override
	public void stNaim() {
		System.out.println("Клей");
	}
	
	public void glueSomth(){
		System.out.println("Приклеиваю клеем");
	}

	public String getMatCorp() {
		return matCorp;
	}

	public void setMatCorp(String matCorp) {
		this.matCorp = matCorp;
	}

	@Override
	public void getInfo() {
		System.out.println("Клей: " + this.getManufacturer() + " , " + this.getPrice());
	}
	
}
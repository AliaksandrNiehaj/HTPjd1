package by.htp.jd1.unit5.hometask05.task01;

public class Scotch extends ConnectingAbstract {
	
	private String scotchColor;
	private String scotchForm;
	
	{
		scotchColor = "Бесцветный";
		scotchForm = "Круглый";
		price = 0.09;
		name = "Скотч";
	}
	
	public Scotch() {
	}
	
	public Scotch(String name) {
		this.name = name;
	}
	
	public Scotch(double price) {
		this.price = price;
	}
	
	public Scotch(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void howToConnect() {
		System.out.println("Скотч скрепляет липкой лентой");
	}

	@Override
	public void stNaim() {
		System.out.println("Скотч");
	}

	public void scotchSomth(){
		System.out.println("Приклеиваю лентой");
	}

	public String getScotchColor() {
		return scotchColor;
	}

	public void setScotchColor(String scotchColor) {
		this.scotchColor = scotchColor;
	}

	public String getScotchForm() {
		return scotchForm;
	}

	public void setScotchForm(String scotchForm) {
		this.scotchForm = scotchForm;
	}

	@Override
	public void getInfo() {
		System.out.println("Скотч: " + this.getManufacturer() + " , " + this.getPrice());
	}
}
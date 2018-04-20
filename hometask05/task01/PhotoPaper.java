package by.htp.jd1.unit5.hometask05.task01;

public class PhotoPaper extends PaperAbstract {
	
	private String color;
	private int widthList;
	private int lenghtList;
	
	{
		color = "Белая";
		widthList = 100;
		lenghtList = 150;
		price = 1.15;
		name = "Фотобумага";
	}
	
	public PhotoPaper() {
	}
	
	public PhotoPaper(String name) {
		this.name = name;
	}
	
	public PhotoPaper(double price) {
		this.price = price;
	}
	
	public PhotoPaper(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void forWhat() {
		System.out.println("Фотобумага для печати фотографий");
	}

	@Override
	public void stNaim() {
		System.out.println("Фотобумага");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidthList() {
		return widthList;
	}

	public void setWidthList(int widthList) {
		this.widthList = widthList;
	}

	public int getLenghtList() {
		return lenghtList;
	}

	public void setLenghtList(int lenghtList) {
		this.lenghtList = lenghtList;
	}

	@Override
	public void getInfo() {
		System.out.println("Фотобумага: " + this.getManufacturer() + " , " + this.getPrice());
	}
}

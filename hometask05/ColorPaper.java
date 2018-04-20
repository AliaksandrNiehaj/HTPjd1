package by.htp.jd1.unit5.hometask05.task01;

public class ColorPaper extends PaperAbstract {
	
	private String color;
	private String format;
	private int widthList;
	private int lenghtList;
	
	{
		color = "Разноцветная";
		format = "A4";
		widthList = 210;
		lenghtList = 297;
		price = 0.46;
		name = "Цветная бумага";
	}
	
	public ColorPaper() {
	}
	
	public ColorPaper(String name) {
		this.name = name;
	}
	
	public ColorPaper(double price) {
		this.price = price;
	}
	
	public ColorPaper(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void forWhat() {
		System.out.println("Цветная бумага для творчества");
	}

	@Override
	public void stNaim() {
		System.out.println("Цветная бумага");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
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
		System.out.println("Цветная бумага: " + this.getManufacturer() + " , " + this.getPrice());
	}

}
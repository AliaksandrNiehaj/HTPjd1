package by.htp.jd1.unit5.hometask05.task01;

public class OfficePaper extends PaperAbstract {
	
	private String color;
	private String format;
	private int widthList;
	private int lenghtList;
	
	{
		color = "Белая";
		format = "A4";
		widthList = 210;
		lenghtList = 297;
		price = 1.02;
		name = "Офисная бумага";
	}
	
	public OfficePaper() {
	}
	
	public OfficePaper(String name) {
		this.name = name;
	}
	
	public OfficePaper(double price) {
		this.price = price;
	}
	
	public OfficePaper(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public void forWhat() {
		System.out.println("Офисная бумага для печати информации");
	}

	@Override
	public void stNaim() {
		System.out.println("Офисная бумага");
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
		System.out.println("Офисная бумага: " + this.getManufacturer() + " , " + this.getPrice());
	}
}
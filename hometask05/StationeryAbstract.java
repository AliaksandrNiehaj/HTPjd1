package by.htp.jd1.unit5.hometask05.task01;

public abstract class StationeryAbstract {
	
	public String name;
	private String manufacturer;
	public double price;
	
	public abstract void stNaim();
	public abstract void getInfo();

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
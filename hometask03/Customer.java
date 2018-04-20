package by.htp.jd1.unit3.hometask03;

public class Customer {
	
	public int id;
	public String surName;
	public String name;
	public String middleName;
	public String adress;
	public int creditCardNum;
	public int bankAccountNum;
	
	public Customer() {
		
	}
	
	public Customer(int id, String surName, String name, String middleName, String adress, int creditCardNum, int bankAccountNum) {
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.middleName = middleName;
		this.adress = adress;
		this.creditCardNum = creditCardNum;
		this.bankAccountNum = bankAccountNum;
	}
	
	public void setID (int id) {
		this.id = id;
	}
	
	public int getID () {
		return id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setSurName (String surName) {
		this.surName = surName;
	}
	
	public String getSurName () {
		return surName;
	}
	
	public void setMiddleName (String middleName) {
		this.middleName = middleName;
	}
	
	public String getMiddleName () {
		return middleName;
	}
	
	public void setAdress (String adress) {
		this.adress = adress;
	}
	
	public String getAdress () {
		return adress;
	}
	
	public void setCreditCardNum (int creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	
	public int getCreditCardNum () {
		return creditCardNum;
	}
	
	public void setBankAccountNum (int bankAccountNum) {
		this.bankAccountNum = bankAccountNum;
	}
	
	public int getBankAccountNum () {
		return bankAccountNum;
	}
	
	public void show() {
		
		System.out.printf("id%s, %s %s %s, %s, %s, %s", this.getID(), this.surName, this.name, this.middleName, this.adress, this.creditCardNum, this.bankAccountNum);
		System.out.println();
	}
	
	public static void getBankInfo() {
		System.out.println("Услуги банка:\n-Обмен валют \n-Прием платежей \n-Открытие счета (счетов) \n-Изготовление банковских карт \n-Пополнение счетов \n-Оформление кредитов");
	}
	
}

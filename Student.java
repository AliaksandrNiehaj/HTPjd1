package by.htp.jd1.unit3.hometask03;

public class Student {
	
	public int id;
	public String name;
	public String surName;
	public String middleName;
	public String birthDate;
	public String adress;
	public int phone;
	public String faculty;
	public int course;
	
	
	public Student() {
	}
	
	public Student(String surName, String name, String middleName, String birthDate, int phone) {
		this.surName = surName;
		this.name = name;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.phone = phone;
	}
	
	public Student(int id, String surName, String name, String middleName, String birthDate, String adress, int phone, String faculty, int course) {
		this.id = id;
		this.surName = surName;
		this.name = name;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.adress = adress;
		this.phone = phone;
		this.faculty = faculty;
		this.course = course;
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
	
	public void setBirthDate (String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getBirthDate () {
		return birthDate;
	}
	
	public void setAdress (String adress) {
		this.adress = adress;
	}
	
	public String getAdress () {
		return adress;
	}
	
	public void setPhone (int phone) {
		this.phone = phone;
	}
	
	public int getPhone () {
		return phone;
	}
	
	public void setFaculty (String faculty) {
		this.faculty = faculty;
	}
	
	public String getFaculty () {
		return faculty;
	}
	
	public void setCourse (int course) {
		this.course = course;
	}
	
	public int getCourse () {
		return course;
	}
	
	public void show() {
		
		System.out.print(this.getID() + ", ");
		System.out.print(this.getSurName() + " ");
		System.out.print(this.getName() + " ");
		System.out.print(this.getMiddleName() + ", ");
		System.out.print(this.getBirthDate() + ", ");
		System.out.print(this.getAdress() + ", ");
		System.out.print(this.getPhone() + ", ");
		System.out.print(this.getFaculty() + ", ");
		System.out.print(this.getCourse());
		System.out.println();
		
	}
	
	public static void getMoney() {
		System.out.println("Я студент, поэтому люблю получать деньги от своих родственников и тратить их в клубах и барах.");
	}
}

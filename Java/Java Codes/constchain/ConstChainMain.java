package constchain;

class grandParent{
	String grandFatherName;
	String grandMotherName;
	
	public grandParent(String grandFatherName, String grandMotherName) {
		this.grandFatherName = grandFatherName;
		this.grandMotherName = grandMotherName;
		System.out.println("Grandparents are : ");
		System.out.println("Grandfather "+this.grandFatherName+" GrandMother"+this.grandMotherName);
	}
	
	
}

class Parent extends grandParent{
	String fatherName;
	String motherName;
	
	public Parent(String grandFatherName, String grandMotherName,String fatherName,String motherName) {
		super(grandFatherName, grandMotherName);
		this.fatherName = fatherName;
		this.motherName = motherName;
		
		System.out.println("Parents are ");
		System.out.println("Father "+this.fatherName+"Mother"+this.motherName);
	}
	
	public Parent(String grandFatherName, String grandMotherName) {
		super(grandFatherName, grandMotherName);
	}
}

class Child extends Parent{
	
	public Child(String grandFatherName, String grandMotherName,String fatherName,String motherName) {
		super(grandFatherName,grandMotherName,fatherName,motherName);
	}
}

public class ConstChainMain{
	public static void main(String[] args) {
		Child c = new Child("abc","xyz","f12","m12");
	}
}

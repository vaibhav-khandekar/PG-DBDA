package contructorchaining;

//Write a Java program that demonstrates the use of constructor chaining to initialize objects 
//of a class hierarchy for different types of food (e.g., pizza, burger, sandwich). 
//The program should allow the user to create objects of each food type and set their
//properties (e.g., toppings, condiments) using different constructor chaining techniques.

class Food{
	String name;
	float price;
	
	Food(){
		System.out.println("Default of Food");
	}

	public Food(String name, float price) {
		super();
		this.name = name;
		this.price = price;
		System.out.println("Hello welcome to our restaurant");
	}
}

class Pizza extends Food{
	
	String topping;
	
	Pizza(String name,float price){
		super(name,price);
		System.out.println("Here's your Pizza with no toppings");
		System.out.println(name+" "+price);
	}
	
	Pizza(String name,float price,String topping){
		super(name,price);
		this.topping = topping;
		System.out.println("Here's your Pizza with toppings");
		System.out.println(name+" "+price+" "+this.topping);
	}
}

class Burger extends Food{
	String condiments;
	
	Burger(String name,float price){
		super(name,price);
		System.out.println("Heres your burger with no condiments");
		System.out.println(name+" "+price);
	}
	
	Burger(String name,float price,String condiments){
		super(name,price);
		this.condiments = condiments;
		System.out.println("Heres your burger with chosen condiments");
		System.out.println(name+" "+price+" "+this.condiments);
	}
}

public class FoodMain {

	public static void main(String[] args) {
		
		Pizza p = new Pizza("Plain Cheese",230,"Pineapple");	
		Pizza p1 = new Pizza("Plain Cheese",230);
		
		Burger b = new Burger("Veg burger",260);
		Burger b1 = new Burger("Veg burger",260,"Mustard Sauce");
		
	}

}

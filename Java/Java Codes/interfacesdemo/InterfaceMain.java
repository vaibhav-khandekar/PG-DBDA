package interfacesdemo;

//Create an interface Interface1 with abstract methods method1 & method2 
//create another interface interface2 with abstract method method3
//Create a class lnterface2 which inherits Interface1 and Interface2
//Override method1 and method3 only in class PartialClass. 

interface interface1{
	abstract void method1();
	
	abstract void method2();
}

interface interface2{
	abstract void method3();
}

class PartialClass implements interface1,interface2{

	@Override
	public void method3() {
		System.out.println("method 3");		
	}

	@Override
	public void method1() {
		System.out.println("method 1");	
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	
	
}
class ConcreteClass extends PartialClass{
	ConcreteClass(){
		
	}	
}
public class InterfaceMain {

	public static void main(String[] args) {
		PartialClass p = new ConcreteClass();
		p.method1();
		p.method3();
		
	}

}

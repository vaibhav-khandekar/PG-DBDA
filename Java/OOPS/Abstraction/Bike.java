import java.lang.reflect.Method;

abstract class Vehicle {
    Vehicle() {
        System.out.println("vehicle constructor");
    }
    
    abstract void method();
    void run1() {
        System.out.println("running smoothly");
    }
}

public class Bike extends Vehicle {
    public void method() {
        System.out.println("volkswagon");
    }
    
    public void run2() {
        System.out.println("requires petrol");
    }
    public static void main(String[] args) {
        Bike b = new Bike();
        b.method();
        b.run1();
        b.run2();
    }
}
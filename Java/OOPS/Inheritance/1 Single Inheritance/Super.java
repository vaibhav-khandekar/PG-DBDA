class Vehicle {
    Vehicle() {
        System.out.println("vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        super();
        System.out.println("car constructor");
    }
}

public class Super {
    public static void main(String[] args) {
        Car c = new Car();
        Object object = new Object(); // object class's object created
    }
}
class Vehicle {
    int doors = 4;
}
class Bike extends Vehicle{
    int wheels = 2;
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.wheels);
        System.out.println(b.doors);
    }
}
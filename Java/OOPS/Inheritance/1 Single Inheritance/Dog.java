class Animal {
    String color="white";
    void PrintA() {
        System.out.println(color);
    }
}

public class Dog extends Animal {
    String color="black";
    public void PrintD() {
        System.out.println(color);
        System.out.println(super.color);
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.PrintA();
        d.PrintD();
    }
}
class Animal {
    void eat() {
        System.out.println("eating ...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking ...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow meow ...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // dog class object
        Dog d = new Dog();
        d.eat();
        d.bark();

        // cat class object
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
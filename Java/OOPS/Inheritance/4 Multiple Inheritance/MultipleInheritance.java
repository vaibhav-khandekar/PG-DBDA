interface Interface1 {
    abstract void a_method1();
    void method1();
}

interface Interface2 {
    abstract void a_method1();
    void method2();
}

// multiple inhertance done here
class MultipleInheritance implements Interface1,Interface2 {

    public void a_method1() {
        System.out.println("abstract method from interface 1");
    }

    public void method1() {
        System.out.println("non-abstract method interface 1");
    }

    public void a_method2() {
        System.out.println("abstract method from interface 2");
    }

    public void method2() {
        System.out.println("non-abstract method interface 2");
    }

    void c_method() {
        System.out.println("method from class");
    }
    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.a_method1();
        mi.method1();
        mi.a_method2();
        mi.method2();
        mi.c_method();
    }
}
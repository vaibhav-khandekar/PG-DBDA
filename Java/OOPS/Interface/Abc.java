interface Interface1 {
    abstract void print();
    void method();
}

class Abc implements Interface1 {
    public void print() {
        System.out.println("print() from class");
    }

    public void method() {
        System.out.println("method from class Abc");
    }

    public static void main(String[] args) {
        Abc a = new Abc();
        a.print();
        a.method();
    }
}
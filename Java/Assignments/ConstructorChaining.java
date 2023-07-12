
class Constructor {
    Constructor() {
        this(5);
        System.out.println("no parameterised constructor");
    }

    Constructor(int a) {
        this(10,15);
        System.out.println("single parameterised constructor");
        int b = a;
        System.out.println("n1 = "+b);
    }

    Constructor(int x,int y){
        System.out.println("two parameterised constructor");
        int m = x;
        int n = y;
        System.out.println("n1 = "+m+" n2 = "+n);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Constructor c = new Constructor();
    }
}
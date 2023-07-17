class Car {
    String s1 = "cars";
}
class VW extends Car {
    String s2 = "volkswagon";
}
public class Polo extends VW{
    String s3 = "polo gti";
    public static void main(String[] args) {
        Polo p = new Polo();
        System.out.println(p.s1);
        System.out.println(p.s2);
        System.out.println(p.s3);
    }
}

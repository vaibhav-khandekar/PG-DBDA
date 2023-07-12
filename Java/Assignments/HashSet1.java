import java.util.HashSet;
import java.util.Iterator;


class Book1 {
    int id;
    String name,author,publisher;
    int quantity;
    public Book1(int id,String name,String author,String publisher,int quantity) {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Book1> hs = new HashSet<Book1>();
        Book1 b1 = new Book1(1, "rich dad poor dad", "surya", "tejaa", 100);
        Book1 b2 = new Book1(2, "let us c", "hrishi", "ritika", 200);
        Book1 b3 = new Book1(3, "atomic habits", "jayesh", "praduman", 500);
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        Iterator<Book1> itr = hs.iterator();
        // Iterator<Book1> itr = hs.iterator();
        for(Book1 b:hs){
            System.out.println("book id = "+b.id+" book name = "+b.name+" "+" book author = "+b.author+" book publisher = "+b.publisher+" quantity = "+b.quantity);
        }
    }
}
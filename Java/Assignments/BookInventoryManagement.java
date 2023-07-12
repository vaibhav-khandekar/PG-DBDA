/* Book Inventory Management System

You are required to write a Java program to implement a Book class that can be
used to manage a book inventory system.
The Book class should have the following fields:
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
The Book class should have following methods
a. Constructor (Default User Defined with some pre Data)
b. Display(); //To Display the instance field
 */

import java.util.Scanner;

class Book {
    String title, author, publisher, isbn;
    int year, quantity;
    double price;
    
    Book(String title,String author,String publisher,String isbn,int year,float price,int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    void Display() {
        System.out.println("title of the book = "+this.title);
        System.out.println("author of the book = "+this.author);
        System.out.println("publisher of the book = "+this.publisher);
        System.out.println("isbn of the book = "+this.isbn);
        System.out.println("year of the book = "+this.year);
        System.out.println("price of the book = "+this.price);
        System.out.println("quantity of the book = "+this.quantity);
    }
}

public class BookInventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter title of the book = ");
        String title = sc.nextLine();
        System.out.print("enter author of the book = ");
        String author = sc.nextLine();
        System.out.print("enter publisher of the book = ");
        String publisher = sc.nextLine();
        System.out.print("enter isbn number of the book = ");
        String isbn = sc.nextLine();
        System.out.print("enter published year of the book = ");
        int year = sc.nextInt();
        System.out.print("enter price of the book = ");
        float price = sc.nextFloat();
        System.out.print("enter quantity of the book = ");
        int quantity = sc.nextInt();
        Book bk = new Book(title,author,publisher,isbn,year,price,quantity);
        bk.Display();
    }
}